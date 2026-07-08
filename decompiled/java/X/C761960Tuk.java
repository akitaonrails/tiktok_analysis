package X;

import Y.AComparatorS511S0100000_12;
import Y.AfS148S0200000_12;
import Y.AfS181S0100000_12;
import Y.AfS64S0201000_12;
import android.os.Handler;
import android.os.Message;
import com.bytedance.android.live.effect.api.EffectRelatedApi;
import com.bytedance.android.live.effect.api.soundeffect.SoundEffect;
import com.bytedance.android.live.effect.api.soundeffect.SoundEffectDatabase;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AwS556S0100000_12;
import tikcast.api.anchor.PinSoundEffectRequest;

/* JADX INFO: renamed from: X.0Tuk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C761960Tuk implements InterfaceC396201gO<C0U74<SoundEffect>> {
    public static final /* synthetic */ int LJFF = 0;
    public final long LIZ;
    public SoundEffect LIZJ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(530));
    public final C761970Tul LIZLLL = new Handler.Callback(this) { // from class: X.0Tul
        public final WeakReference<C761960Tuk> LL;

        {
            this.LL = new WeakReference<>(this);
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            List listLJJLJLI;
            C761960Tuk c761960Tuk = this.LL.get();
            if (c761960Tuk == null || message.what != 100) {
                return false;
            }
            long[] longArray = message.getData().getLongArray("sfx_id_list");
            if (longArray == null || (listLJJLJLI = C13LQ.LJJLJLI(longArray)) == null) {
                listLJJLJLI = C13BV.INSTANCE;
            }
            c761960Tuk.LJ(message.arg1, listLJJLJLI);
            return true;
        }
    };
    public final C01GW<Handler> LJ = C452501pT.LIZIZ(new AwS556S0100000_12(this, 980));

    public final List<C0U74<SoundEffect>> LIZ() {
        List<SoundEffect> all = SoundEffectDatabase.LL.LIZ().getAll();
        if (!all.isEmpty()) {
            LIZLLL().clear();
            LIZLLL().addAll(all);
        }
        return Collections.singletonList(new C0U74("sound_effect", "sound_effect", null, null, null, all, null, 248));
    }

    public final List<SoundEffect> LIZLLL() {
        return (List) this.LIZIZ.getValue();
    }

    public final void LJFF() {
        if (!LIZLLL().isEmpty()) {
            InterfaceC761980Tum interfaceC761980TumLIZ = SoundEffectDatabase.LL.LIZ();
            interfaceC761980TumLIZ.LIZIZ();
            interfaceC761980TumLIZ.LIZ(LIZLLL());
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0Tul] */
    public C761960Tuk(long j) {
        this.LIZ = j;
    }

    public final Object LIZIZ(InterfaceC1364105Vn<? super List<C0U74<SoundEffect>>> interfaceC1364105Vn) {
        return Collections.singletonList(new C0U74("sound_effect", "sound_effect", null, null, null, LIZLLL(), null, 248));
    }

    public final Object LIZJ(InterfaceC1364105Vn<? super List<C0U74<SoundEffect>>> interfaceC1364105Vn) {
        C23260099m c23260099m = new C23260099m(C099M.LIZLLL(interfaceC1364105Vn));
        ((EffectRelatedApi) C482260Ivg.LIZJ(EffectRelatedApi.class)).fetchSoundEffect(this.LIZ).LJL(C11S5.LIZ()).LJJLL(new AfS148S0200000_12(this, c23260099m, 74), new AfS181S0100000_12(c23260099m, 308));
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLIZ;
    }

    public final void LJ(int i, List list) {
        if (list.isEmpty()) {
            return;
        }
        List<SoundEffect> listLIZLLL = LIZLLL();
        if (listLIZLLL.size() > 1) {
            C08XD.LJJ(listLIZLLL, new AComparatorS511S0100000_12(list, 2));
        }
        this.LJ.getValue().removeMessages(100);
        EffectRelatedApi effectRelatedApi = (EffectRelatedApi) C482260Ivg.LIZJ(EffectRelatedApi.class);
        PinSoundEffectRequest pinSoundEffectRequest = new PinSoundEffectRequest();
        pinSoundEffectRequest.soundEffectIdList.addAll(list);
        effectRelatedApi.uploadSoundEffectOrder(pinSoundEffectRequest).LJL(C11S5.LIZ()).LJJLL(new AfS181S0100000_12(this, 309), new AfS64S0201000_12(i, this, list, 1));
    }
}
