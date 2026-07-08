package X;

import Y.AfS38S1200000_2;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.06pV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1726706pV extends C09AY implements Function1<C770770ULj, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ MutableLiveData<Integer> LLILLJJLI;
    public final /* synthetic */ MutableLiveData<Integer> LLILLL;
    public final /* synthetic */ MutableLiveData<Integer> LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ C19EG LLILZLL;
    public final /* synthetic */ C259800zU<TuxSheet> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1726706pV(String str, MutableLiveData<Integer> mutableLiveData, MutableLiveData<Integer> mutableLiveData2, MutableLiveData<Integer> mutableLiveData3, String str2, C19EG c19eg, C259800zU<TuxSheet> c259800zU) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = mutableLiveData;
        this.LLILLL = mutableLiveData2;
        this.LLILZ = mutableLiveData3;
        this.LLILZIL = str2;
        this.LLILZLL = c19eg;
        this.LLIZ = c259800zU;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C770770ULj c770770ULj) {
        Integer value;
        Integer value2;
        Integer value3;
        c770770ULj.LIZIZ = false;
        C1163504gr.LIZIZ.onEventV3("click_inbox_popup", C2097608Jq.LJIIIIZZ(new Pair("action", CardStruct.IStatusCode.DEFAULT), new Pair("enter_from", this.LL)));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        MutableLiveData<Integer> mutableLiveData = this.LLILLJJLI;
        if (mutableLiveData != null && (value3 = mutableLiveData.getValue()) != null) {
            linkedHashMap.put("dm_setting_friends", Integer.valueOf(value3.intValue()));
        }
        MutableLiveData<Integer> mutableLiveData2 = this.LLILLL;
        if (mutableLiveData2 != null && (value2 = mutableLiveData2.getValue()) != null) {
            linkedHashMap.put("dm_setting_potential_connection", Integer.valueOf(value2.intValue()));
        }
        MutableLiveData<Integer> mutableLiveData3 = this.LLILZ;
        if (mutableLiveData3 != null && (value = mutableLiveData3.getValue()) != null) {
            linkedHashMap.put("dm_setting_others", Integer.valueOf(value.intValue()));
        }
        if (true ^ linkedHashMap.isEmpty()) {
            String str = this.LLILZIL;
            C19EG c19eg = this.LLILZLL;
            C259800zU<TuxSheet> c259800zU = this.LLIZ;
            C191871104n.LJ().getClass();
            C191862104e.LIZ(linkedHashMap).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS38S1200000_2(c19eg, str, c259800zU, 0), new C516201zk(c259800zU, 109));
        }
        return Unit.LIZ;
    }
}
