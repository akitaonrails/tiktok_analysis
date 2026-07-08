package X;

import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: renamed from: X.05iS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.mixediting.resource.utils.downloader.AutoPickTemplateAssetDownloader$downloadData$musicFlow$2", f = "AutoPickTemplateAssetDownloader.kt", l = {}, m = "invokeSuspend")
public final class C1428205iS extends C09AX implements InterfaceC1631620sYq<InterfaceC346701Wf<? super Pair<? extends Integer, ? extends AVMusic>>, Throwable, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1428205iS(String str, String str2, InterfaceC1364105Vn<? super C1428205iS> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = str2;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String simpleName;
        C1C7U.LIZ("AutoPickTemplateAssetDownloader@c432.downloadData$musicFlow$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Throwable th = (Throwable) this.LL;
        C0MJ8 c0mj8 = C0MJ8.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AutoPickTemplateAssetDownloader -> [diag] musicFlow completion assetId=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", musicId=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", cause=");
        String message = null;
        if (th != null) {
            simpleName = th.getClass().getSimpleName();
        } else {
            simpleName = null;
        }
        sbLIZ.append(simpleName);
        sbLIZ.append(':');
        if (th != null) {
            message = th.getMessage();
        }
        sbLIZ.append(message);
        C201955140j.LIZJ(c0mj8, C2188811AlT.LIZIZ(sbLIZ));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AutoPickTemplateAssetDownloader@c432.downloadData$musicFlow$2");
        return unit;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(InterfaceC346701Wf<? super Pair<? extends Integer, ? extends AVMusic>> interfaceC346701Wf, Throwable th, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        C1428205iS c1428205iS = new C1428205iS(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
        c1428205iS.LL = th;
        return c1428205iS.invokeSuspend(Unit.LIZ);
    }
}
