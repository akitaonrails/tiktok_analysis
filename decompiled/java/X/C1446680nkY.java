package X;

import android.text.TextUtils;
import com.bef.effectsdk.message.MessageCenter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.recordinteraction.EffectLocation;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.recordinteraction.EffectLocationMessage;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.ss.android.ugc.aweme.sticker.panel.guide.ExtraParams;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import lth.o;

/* JADX INFO: renamed from: X.0nkY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1446680nkY implements MessageCenter.Listener {
    public String LL = "";
    public String LLILLJJLI = "";
    public boolean LLILLL = true;
    public final LinkedHashMap<String, List<NormalTrackTimeStamp>> LLILZ = new LinkedHashMap<>();
    public final LinkedHashMap<String, ExtraParams> LLILZIL = new LinkedHashMap<>();
    public int LLILZLL = 0;
    public boolean LLIZ = false;

    public C1446680nkY() {
        MessageCenter.init();
        MessageCenter.addListener(this);
    }

    public final void LIZIZ(int i) {
        if (!this.LLILLL) {
            return;
        }
        Iterator<Map.Entry<String, List<NormalTrackTimeStamp>>> it2 = this.LLILZ.entrySet().iterator();
        while (it2.hasNext()) {
            List<NormalTrackTimeStamp> value = it2.next().getValue();
            if (!C086I.LIZIZ(value)) {
                Iterator<NormalTrackTimeStamp> it3 = value.iterator();
                while (it3.hasNext()) {
                    if (it3.next().getPts() > i) {
                        it3.remove();
                    }
                }
            }
        }
    }

    public final void LIZ(int i, ExtraParams extraParams) {
        if (!this.LLILLL || C2093608Ic.LJ(this.LL)) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        List<NormalTrackTimeStamp> list = this.LLILZ.get(this.LLILLJJLI);
        if (!C086I.LIZIZ(list)) {
            arrayList.addAll(list);
        }
        try {
            EffectLocationMessage effectLocationMessage = (EffectLocationMessage) o.LJIJ.getRetrofitFactoryGson().LJII(this.LL, EffectLocationMessage.class);
            if (effectLocationMessage != null && !C086I.LIZIZ(effectLocationMessage.locations)) {
                LinkedList linkedList = new LinkedList();
                for (EffectLocation effectLocation : effectLocationMessage.locations) {
                    NormalTrackTimeStamp normalTrackTimeStamp = new NormalTrackTimeStamp();
                    normalTrackTimeStamp.setPts(i);
                    normalTrackTimeStamp.setWidth(effectLocation.getW());
                    normalTrackTimeStamp.setHeight(effectLocation.getH());
                    normalTrackTimeStamp.setX(effectLocation.getX());
                    normalTrackTimeStamp.setY(effectLocation.getY());
                    normalTrackTimeStamp.setScale(Float.valueOf(1.0f));
                    normalTrackTimeStamp.setRotation(effectLocation.getR());
                    linkedList.add(normalTrackTimeStamp);
                }
                arrayList.addAll(linkedList);
                this.LLILZ.put(this.LLILLJJLI, arrayList);
                this.LLILZIL.put(this.LLILLJJLI, extraParams);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // com.bef.effectsdk.message.MessageCenter.Listener
    public final void onMessageReceived(int i, int i2, int i3, String str) {
        if (i == 28) {
            this.LL = str;
            if (!this.LLIZ && !TextUtils.equals(str, "{\"locations\":[]}")) {
                this.LLIZ = true;
            }
        }
    }
}
