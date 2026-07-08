package X;

import android.content.Context;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.interfaces.ITemplateResourceService;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS194S0000000_8;
import njp.a;

/* JADX INFO: renamed from: X.0Kw4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.mixediting.resource.utils.downloader.CCTemplateAssetDownloaderKt$downloadCCMusic$1", f = "CCTemplateAssetDownloader.kt", l = {441}, m = "invokeSuspend")
public final class C533460Kw4 extends C09AX implements Function2<C094D<? super Pair<? extends Integer, ? extends AVMusic>>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ Boolean LLILZIL;
    public final /* synthetic */ Context LLILZLL;
    public final /* synthetic */ String LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C533460Kw4(Context context, Boolean bool, String str, String str2, String str3, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = bool;
        this.LLILZLL = context;
        this.LLIZ = str3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        String str = this.LLILLL;
        String str2 = this.LLILZ;
        C533460Kw4 c533460Kw4 = new C533460Kw4(this.LLILZLL, this.LLILZIL, str, str2, this.LLIZ, interfaceC1364105Vn);
        c533460Kw4.LLILLJJLI = obj;
        return c533460Kw4;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CCTemplateAssetDownloaderKt@f9f7.downloadCCMusic$1");
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
            final C118300cf c118300cf = new C118300cf();
            c118300cf.element = -1;
            C0MJ8 c0mj8 = C0MJ8.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[MixEditDl] downloadCCMusic start musicId=");
            sbLIZ.append(this.LLILLL);
            sbLIZ.append(" templateId=");
            sbLIZ.append(this.LLILZ);
            sbLIZ.append(" musicPostUnavailable=");
            sbLIZ.append(this.LLILZIL);
            C201955140j.LIZJ(c0mj8, C2188811AlT.LIZIZ(sbLIZ));
            ITemplateResourceService iTemplateResourceService = (ITemplateResourceService) ServiceManager.get().getService(ITemplateResourceService.class);
            Context context = this.LLILZLL;
            final String str = this.LLILLL;
            final String str2 = this.LLIZ;
            Boolean bool = this.LLILZIL;
            final String str3 = this.LLILZ;
            iTemplateResourceService.LIZ(context, str, str2, null, bool, new C1418100n0S("mix_editing", str3, EnumC1412640mre.CUT_SAME), new InterfaceC1428880nHq() { // from class: X.0Kw3
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
                    int iLJ = C13LZ.LJ(i2 / 10, 0, 10);
                    C118300cf c118300cf2 = c118300cf;
                    if (iLJ != c118300cf2.element) {
                        c118300cf2.element = iLJ;
                        C0MJ8 c0mj82 = C0MJ8.LIZIZ;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("[MixEditDl] downloadCCMusic progress musicId=");
                        sbLIZ2.append(str);
                        sbLIZ2.append(" templateId=");
                        sbLIZ2.append(str3);
                        sbLIZ2.append(" progress=");
                        sbLIZ2.append(i2);
                        sbLIZ2.append(" ~");
                        sbLIZ2.append(iLJ * 10);
                        sbLIZ2.append('%');
                        C201955140j.LIZJ(c0mj82, C2188811AlT.LIZIZ(sbLIZ2));
                    }
                    c094d.LJIIIIZZ(new Pair<>(Integer.valueOf(i2), null));
                }

                @Override // X.InterfaceC1428880nHq
                public final void LIZ(Integer num, String str4) {
                    C0MJ8 c0mj82 = C0MJ8.LIZIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("[MixEditDl] downloadCCMusic onFailure musicId=");
                    sbLIZ2.append(str);
                    sbLIZ2.append(" templateId=");
                    sbLIZ2.append(str3);
                    sbLIZ2.append(" errCode=");
                    sbLIZ2.append(num);
                    sbLIZ2.append(" errMsg=");
                    sbLIZ2.append(str4);
                    C201955140j.LJII(c0mj82, C2188811AlT.LIZIZ(sbLIZ2));
                    C094D<Pair<Integer, ? extends AVMusic>> c094d2 = c094d;
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("456, musicId= ");
                    sbLIZ3.append(str);
                    sbLIZ3.append(", musicUrl= ");
                    sbLIZ3.append(str2);
                    sbLIZ3.append(", errCode= ");
                    sbLIZ3.append(num);
                    sbLIZ3.append(", errMsg= ");
                    sbLIZ3.append(str4);
                    c094d2.LJIIJJI(new RuntimeException(C2188811AlT.LIZIZ(sbLIZ3)));
                }

                @Override // X.InterfaceC1428880nHq
                public final void LJFF(AVMusic aVMusic, String str4, boolean z, boolean z2) {
                    String str5;
                    if (C301650Bs3.LIZ()) {
                        long jLongValue = 0;
                        if (aVMusic.id < 0 && (str5 = str) != null && str5.length() != 0) {
                            aVMusic.setMusicId(str);
                            Long lLJIILIIL = C2095008Iq.LJIILIIL(str);
                            if (lLJIILIIL != null) {
                                jLongValue = lLJIILIIL.longValue();
                            }
                            aVMusic.setLocalMusicId(jLongValue);
                        }
                    }
                    C0MJ8 c0mj82 = C0MJ8.LIZIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("[MixEditDl] downloadCCMusic onSuccess musicId=");
                    sbLIZ2.append(str);
                    sbLIZ2.append(" templateId=");
                    sbLIZ2.append(str3);
                    sbLIZ2.append(" path=");
                    sbLIZ2.append(str4);
                    sbLIZ2.append(" useCache=");
                    sbLIZ2.append(z);
                    C201955140j.LIZJ(c0mj82, C2188811AlT.LIZIZ(sbLIZ2));
                    C094D<Pair<Integer, ? extends AVMusic>> c094d2 = c094d;
                    aVMusic.path = str4;
                    c094d2.LJIIIIZZ(new Pair<>(100, aVMusic));
                    c094d.LJIIJJI(null);
                }
            });
            AFwS194S0000000_8 aFwS194S0000000_8 = AFwS194S0000000_8.get$arr$(519);
            this.LL = 1;
            if (C23128094k.LIZ(c094d, aFwS194S0000000_8, this) == objLJFF) {
                C1C7U.LIZIZ("CCTemplateAssetDownloaderKt@f9f7.downloadCCMusic$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CCTemplateAssetDownloaderKt@f9f7.downloadCCMusic$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C094D<? super Pair<? extends Integer, ? extends AVMusic>> c094d, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c094d, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
