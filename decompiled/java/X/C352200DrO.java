package X;

import com.ss.android.vesdk.VEUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0DrO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.aweme.audio.copyrightdetect.NLEAudioUtils$suspendGetAudioFromVideos$2", f = "NLEAudioUtils.kt", l = {}, m = "invokeSuspend")
public final class C352200DrO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super String>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C352200DrO(String str, long j, long j2, InterfaceC1364105Vn<? super C352200DrO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = j;
        this.LLILLL = j2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C352200DrO(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String strLIZ;
        C1C7U.LIZ("NLEAudioUtils@9f2b.suspendGetAudioFromVideos$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C352190DrN c352190DrN = C352190DrN.LIZ;
        String str = this.LL;
        long j = this.LLILLJJLI;
        long j2 = this.LLILLL;
        c352190DrN.getClass();
        String strValueOf = String.valueOf(str.hashCode());
        InterfaceC570310MYj pathService = C0CHQ.LIZ().LJJIIJZLJL().getPathService();
        EnumC20227914Cv enumC20227914Cv = EnumC20227914Cv.AUDIO_COPYRIGHT_DETECT;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(strValueOf);
        sbLIZ.append(".wav");
        C0VSJ c0vsjLJIIIZ = pathService.LJIIIZ(enumC20227914Cv, C2188811AlT.LIZIZ(sbLIZ), false);
        if (c0vsjLJIIIZ.exists()) {
            strLIZ = C352190DrN.LIZ(j, j2, c0vsjLJIIIZ.getPath(), strValueOf);
        } else {
            InterfaceC570310MYj pathService2 = C0CHQ.LIZ().LJJIIJZLJL().getPathService();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(strValueOf);
            sbLIZ2.append(".wav");
            if (VEUtils.detachAudioFromVideos(pathService2.LJIIIZ(enumC20227914Cv, C2188811AlT.LIZIZ(sbLIZ2), true).getPath(), new String[]{str}, new long[]{-1}, new long[]{-1}, -1L, -1L, new float[]{1.0f}, 1, 131072, 8000, VEUtils.CompatibleMode.Skip_invalid) == 0) {
                strLIZ = C352190DrN.LIZ(j, j2, c0vsjLJIIIZ.getPath(), strValueOf);
            } else {
                strLIZ = "";
            }
        }
        C1C7U.LIZIZ("NLEAudioUtils@9f2b.suspendGetAudioFromVideos$2");
        return strLIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
