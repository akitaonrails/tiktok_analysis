package X;

import com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicCrossLinker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1CcI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2234081CcI extends C09AY implements Function1<LinkMicCrossLinker, Unit> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ C2234371Ccl LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2234081CcI(int i, C2234371Ccl c2234371Ccl, String str, String str2) {
        super(1);
        this.LL = i;
        this.LLILLJJLI = c2234371Ccl;
        this.LLILLL = str;
        this.LLILZ = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LinkMicCrossLinker linkMicCrossLinker) {
        EnumC1277330jLP enumC1277330jLP;
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    enumC1277330jLP = EnumC1277330jLP.All;
                } else {
                    enumC1277330jLP = EnumC1277330jLP.OnlyAudio;
                }
            } else {
                enumC1277330jLP = EnumC1277330jLP.OnlyVideo;
            }
        } else {
            enumC1277330jLP = EnumC1277330jLP.All;
        }
        this.LLILLJJLI.LIZ.LLJJJ(this.LLILLL, this.LLILZ, enumC1277330jLP);
        return Unit.LIZ;
    }
}
