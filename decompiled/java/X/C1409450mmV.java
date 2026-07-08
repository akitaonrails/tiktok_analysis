package X;

import com.ss.android.ugc.aweme.exp.DMInboxChangeRightZoneClickableSizeExp;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0mmV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.sticker.inspiration.data.ImageInspirationDataManager$fetchInspirationData$2", f = "ImageInspirationDataManager.kt", l = {DMInboxChangeRightZoneClickableSizeExp.NEW_DP_SIZE, 73, 74}, m = "invokeSuspend")
public final class C1409450mmV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C1409380mmO>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ VideoPublishEditModel LLILZ;
    public final /* synthetic */ C1409480mmY LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1409450mmV(VideoPublishEditModel videoPublishEditModel, C1409480mmY c1409480mmY, InterfaceC1364105Vn<? super C1409450mmV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = videoPublishEditModel;
        this.LLILZIL = c1409480mmY;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1409450mmV c1409450mmV = new C1409450mmV(this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c1409450mmV.LLILLL = obj;
        return c1409450mmV;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b6  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1409450mmV.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C1409380mmO> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
