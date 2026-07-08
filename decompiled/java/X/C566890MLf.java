package X;

import com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia;
import com.ss.android.ugc.aweme.exp.DMInboxChangeRightZoneClickableSizeExp;
import com.ss.android.ugc.aweme.services.story.forward.ForwardImageDownloader;
import com.ss.android.ugc.aweme.services.story.forward.ForwardMediaDownloader;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0MLf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.share.OnThisDayDownloadPhotoLogic$downloadPhotoModeResource$1", f = "OnThisDayDownloadPhotoLogic.kt", l = {DMInboxChangeRightZoneClickableSizeExp.NEW_DP_SIZE}, m = "invokeSuspend")
public final class C566890MLf extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C566910MLh LL;
    public ForwardImageDownloader.ImageDownloadListener LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public Object LLILZIL;
    public boolean LLILZLL;
    public int LLIZ;
    public /* synthetic */ Object LLIZLLLIL;
    public final /* synthetic */ ForwardMedia LLJ;
    public final /* synthetic */ List<ForwardMediaDownloader.DownloadConfig> LLJI;
    public final /* synthetic */ ForwardImageDownloader.ImageDownloadListener LLJIJIL;
    public final /* synthetic */ C566910MLh LLJILJIL;
    public final /* synthetic */ boolean LLJILJILJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C566890MLf(ForwardMedia forwardMedia, List<ForwardMediaDownloader.DownloadConfig> list, ForwardImageDownloader.ImageDownloadListener imageDownloadListener, C566910MLh c566910MLh, boolean z, InterfaceC1364105Vn<? super C566890MLf> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLJ = forwardMedia;
        this.LLJI = list;
        this.LLJIJIL = imageDownloadListener;
        this.LLJILJIL = c566910MLh;
        this.LLJILJILJ = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C566890MLf c566890MLf = new C566890MLf(this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, interfaceC1364105Vn);
        c566890MLf.LLIZLLLIL = obj;
        return c566890MLf;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0036  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0096 -> B:6:0x002d). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C566890MLf.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
