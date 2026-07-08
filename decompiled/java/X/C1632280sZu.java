package X;

import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.ShootExtraData;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0sZu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.prop.EffectPreloadManager$tryStartShootWithoutWaitingDownload$1$2", f = "EffectPreloadManager.kt", l = {}, m = "invokeSuspend")
public final class C1632280sZu extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1632250sZr LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Effect LLILLL;
    public final /* synthetic */ Music LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ ShootExtraData LLILZLL;
    public final /* synthetic */ AbstractC1661070tKL LLIZ;
    public final /* synthetic */ InterfaceC1661080tKM LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1632280sZu(C1632250sZr c1632250sZr, String str, Effect effect, Music music, String str2, ShootExtraData shootExtraData, AbstractC1661070tKL abstractC1661070tKL, InterfaceC1661080tKM interfaceC1661080tKM, InterfaceC1364105Vn<? super C1632280sZu> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1632250sZr;
        this.LLILLJJLI = str;
        this.LLILLL = effect;
        this.LLILZ = music;
        this.LLILZIL = str2;
        this.LLILZLL = shootExtraData;
        this.LLIZ = abstractC1661070tKL;
        this.LLIZLLLIL = interfaceC1661080tKM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1632280sZu(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EffectPreloadManager@9d7.tryStartShootWithoutWaitingDownload$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1632250sZr c1632250sZr = this.LL;
        String str = this.LLILLJJLI;
        Effect effect = this.LLILLL;
        MusicModel musicModelConvertToMusicModel = this.LLILZ.convertToMusicModel();
        String str2 = this.LLILZIL;
        ShootExtraData shootExtraData = this.LLILZLL;
        AbstractC1661070tKL abstractC1661070tKL = this.LLIZ;
        InterfaceC1661080tKM interfaceC1661080tKM = this.LLIZLLLIL;
        c1632250sZr.getClass();
        C1632250sZr.LIZIZ(str, effect, musicModelConvertToMusicModel, str2, shootExtraData, abstractC1661070tKL, interfaceC1661080tKM);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EffectPreloadManager@9d7.tryStartShootWithoutWaitingDownload$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
