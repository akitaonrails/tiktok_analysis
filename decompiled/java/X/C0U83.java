package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import kotlin.jvm.functions.Function2;
import webcast.data.EffectStruct;

/* JADX INFO: renamed from: X.0U83, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0U83 extends C09AY implements Function2<Integer, EffectStruct, LiveEffect> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ LiveEffect LLILLL;
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0U83(int i, LiveEffect liveEffect, String str, String str2) {
        super(2);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = liveEffect;
        this.LLILZ = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final LiveEffect invoke(Integer num, EffectStruct effectStruct) {
        int iIntValue = num.intValue();
        LiveEffect liveEffectLJ = C0UEO.LJ(effectStruct);
        String str = this.LL;
        String str2 = this.LLILLJJLI;
        LiveEffect liveEffect = this.LLILLL;
        int i = this.LLILZ;
        liveEffectLJ.LJIL(true);
        liveEffectLJ.LLJLIL(str);
        liveEffectLJ.LJIIJJI(str2);
        liveEffectLJ.LLILIL(liveEffect);
        liveEffectLJ.LJJLI(Integer.valueOf(i));
        liveEffectLJ.LJZ(Integer.valueOf(iIntValue));
        return liveEffectLJ;
    }
}
