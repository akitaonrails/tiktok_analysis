package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0MOL, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.lightening.canvas.forward.onthisday.PhotoModeEditModelBuildHelper$addPhotoModeNecessaryInfo$2", f = "PhotoModeEditModelBuildHelper.kt", l = {47}, m = "invokeSuspend")
public final class C0MOL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C0MKF LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public MediaModel LLILZIL;
    public MediaModel LLILZLL;
    public UrlModel LLIZ;
    public MediaModel LLIZLLLIL;
    public Object LLJ;
    public int LLJI;
    public int LLJIJIL;
    public final /* synthetic */ List<String> LLJILJIL;
    public final /* synthetic */ boolean LLJILJILJ;
    public final /* synthetic */ Bundle LLJILLL;
    public final /* synthetic */ VideoPublishEditModel LLJJ;
    public final /* synthetic */ C0MKF LLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0MOL(List<String> list, boolean z, Bundle bundle, VideoPublishEditModel videoPublishEditModel, C0MKF c0mkf, InterfaceC1364105Vn<? super C0MOL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLJILJIL = list;
        this.LLJILJILJ = z;
        this.LLJILLL = bundle;
        this.LLJJ = videoPublishEditModel;
        this.LLJJI = c0mkf;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0MOL(this.LLJILJIL, this.LLJILJILJ, this.LLJILLL, this.LLJJ, this.LLJJI, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d2  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00ad -> B:6:0x0035). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00b2 -> B:7:0x0046). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r44) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 758
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0MOL.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
