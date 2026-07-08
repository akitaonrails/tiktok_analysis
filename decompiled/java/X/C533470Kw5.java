package X;

import android.content.Context;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.interfaces.ITemplateResourceService;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS194S0000000_8;
import njp.a;

/* JADX INFO: renamed from: X.0Kw5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.mixediting.resource.utils.downloader.SGTAssetDownloaderKt$downloadSgtMusic$1", f = "SGTAssetDownloader.kt", l = {139}, m = "invokeSuspend")
public final class C533470Kw5 extends C09AX implements Function2<C094D<? super Pair<? extends Integer, ? extends AVMusic>>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Context LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ Boolean LLILZLL;
    public final /* synthetic */ String LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C533470Kw5(Context context, Boolean bool, String str, String str2, String str3, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = str;
        this.LLILZ = context;
        this.LLILZIL = str2;
        this.LLILZLL = bool;
        this.LLIZ = str3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        String str = this.LLILLL;
        C533470Kw5 c533470Kw5 = new C533470Kw5(this.LLILZ, this.LLILZLL, str, this.LLILZIL, this.LLIZ, interfaceC1364105Vn);
        c533470Kw5.LLILLJJLI = obj;
        return c533470Kw5;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SGTAssetDownloaderKt@b359.downloadSgtMusic$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            final C094D c094d = (C094D) this.LLILLJJLI;
            ITemplateResourceService iTemplateResourceService = (ITemplateResourceService) PluggableExtentionKt.pluggableSpi$default(ITemplateResourceService.class, false, false, false, 14, null);
            if (iTemplateResourceService == null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("SGT music download failed, template resource service unavailable, musicId=");
                sbLIZ.append(this.LLILLL);
                c094d.LJIIJJI(new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ)));
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("SGTAssetDownloaderKt@b359.downloadSgtMusic$1");
                return unit;
            }
            Context context = this.LLILZ;
            final String str = this.LLILLL;
            iTemplateResourceService.LIZ(context, str, this.LLILZIL, null, this.LLILZLL, new C1418100n0S("mix_editing", this.LLIZ, EnumC1412640mre.SGT), new InterfaceC1428880nHq() { // from class: X.0Kw6
                @Override // X.InterfaceC1428880nHq
                public final void LIZIZ(Exception exc) {
                }

                @Override // X.InterfaceC1428880nHq
                public final void LIZJ() {
                }

                @Override // X.InterfaceC1428880nHq
                public final void LIZLLL(AVMusic aVMusic) {
                }

                @Override // X.InterfaceC1428880nHq
                public final void LJ() {
                }

                @Override // X.InterfaceC1428880nHq
                public final void LJI() {
                }

                @Override // X.InterfaceC1428880nHq
                public final void LJIIIIZZ() {
                }

                @Override // X.InterfaceC1428880nHq
                public final void LJII(int i2) {
                    c094d.LJIIIIZZ(new Pair<>(Integer.valueOf(i2), null));
                }

                @Override // X.InterfaceC1428880nHq
                public final void LIZ(Integer num, String str2) {
                    C094D<Pair<Integer, ? extends AVMusic>> c094d2 = c094d;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("SGT music download failed, musicId=");
                    sbLIZ2.append(str);
                    sbLIZ2.append(", errCode=");
                    sbLIZ2.append(num);
                    sbLIZ2.append(", errMsg=");
                    sbLIZ2.append(str2);
                    c094d2.LJIIJJI(new RuntimeException(C2188811AlT.LIZIZ(sbLIZ2)));
                }

                @Override // X.InterfaceC1428880nHq
                public final void LJFF(AVMusic aVMusic, String str2, boolean z, boolean z2) {
                    C094D<Pair<Integer, ? extends AVMusic>> c094d2 = c094d;
                    aVMusic.path = str2;
                    c094d2.LJIIIIZZ(new Pair<>(100, aVMusic));
                    c094d.LJIIJJI(null);
                }
            });
            AFwS194S0000000_8 aFwS194S0000000_8 = AFwS194S0000000_8.get$arr$(516);
            this.LL = 1;
            if (C23128094k.LIZ(c094d, aFwS194S0000000_8, this) == objLJFF) {
                C1C7U.LIZIZ("SGTAssetDownloaderKt@b359.downloadSgtMusic$1");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("SGTAssetDownloaderKt@b359.downloadSgtMusic$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C094D<? super Pair<? extends Integer, ? extends AVMusic>> c094d, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c094d, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
