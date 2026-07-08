package X;

import com.ss.android.ugc.aweme.aime.IAIMEServices;
import com.ss.android.ugc.aweme.creative.model.AISelfModel;
import com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig;
import com.ss.android.ugc.aweme.publish.model.UploadImageConfig;
import com.ss.android.ugc.aweme.sticker.AiMeStyleInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0miy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.wavepublish.normal.AISelfUploadTask$uploadAISelfForRecordVideoMode$1", f = "AISelfUploadTask.kt", l = {151, 156, 156, 152}, m = "invokeSuspend")
public final class C1407260miy extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C1407220miu LL;
    public AISelfModel LLILLJJLI;
    public UploadImageConfig LLILLL;
    public Object LLILZ;
    public AiMeStyleInfo LLILZIL;
    public Object LLILZLL;
    public Object LLIZ;
    public Object LLIZLLLIL;
    public Object LLJ;
    public IAIMEServices LLJI;
    public int LLJIJIL;
    public final /* synthetic */ UploadAuthKeyConfig LLJILJIL;
    public final /* synthetic */ C1407220miu LLJILJILJ;
    public final /* synthetic */ AISelfModel LLJILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1407260miy(AISelfModel aISelfModel, UploadAuthKeyConfig uploadAuthKeyConfig, C1407220miu c1407220miu, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLJILJIL = uploadAuthKeyConfig;
        this.LLJILJILJ = c1407220miu;
        this.LLJILLL = aISelfModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1407260miy(this.LLJILLL, this.LLJILJIL, this.LLJILJILJ, interfaceC1364105Vn);
    }

    /* JADX WARN: Path cross not found for [B:11:0x0039, B:64:0x0206], limit reached: 75 */
    /* JADX WARN: Path cross not found for [B:64:0x0206, B:11:0x0039], limit reached: 75 */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x024e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x008f -> B:16:0x007e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00ae -> B:16:0x007e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00b0 -> B:16:0x007e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x01fe -> B:9:0x0035). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x0206 -> B:14:0x0072). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r27) {
        /*
            Method dump skipped, instruction units count: 601
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1407260miy.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
