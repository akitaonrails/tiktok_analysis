package X;

import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0EC9, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.capabilities.audio.music.ui.EditorProMultiMusicComponent$restoreMusicInfoFromOldDraft$1", f = "EditorProMultiMusicComponent.kt", l = {123}, m = "invokeSuspend")
public final class C0EC9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ MusicBuzModel LLILLL;
    public final /* synthetic */ C0ECA LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0EC9(MusicBuzModel musicBuzModel, C0ECA c0eca, InterfaceC1364105Vn<? super C0EC9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = musicBuzModel;
        this.LLILZ = c0eca;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0EC9 c0ec9 = new C0EC9(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c0ec9.LLILLJJLI = obj;
        return c0ec9;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EditorProMultiMusicComponent@16ec.restoreMusicInfoFromOldDraft$1");
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
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            String strLIZJ = C1429680nJ8.LIZJ(this.LLILLL);
            AVMusic aVMusicVk = C1403010mc7.LIZ.getMusicService().Vk(strLIZJ);
            if (!C2296808zG.LJI(interfaceC497601wk)) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("EditorProMultiMusicComponent@16ec.restoreMusicInfoFromOldDraft$1");
                return unit;
            }
            if (Intrinsics.LJFF(C1429680nJ8.LIZJ(this.LLILZ.getEditModel().creativeModel.musicBuzModel), strLIZJ)) {
                C1452640nuA.LJII(aVMusicVk, false, this.LLILLL);
                if (aVMusicVk != null && aVMusicVk.canBeStitched()) {
                    C1DFH c1dfh = C0PEM.LIZ;
                    AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
                    C0EC8 c0ec8 = new C0EC8(this.LLILZ, null);
                    this.LL = 1;
                    if (C23250099c.LJI(this, abstractC2238408pq, c0ec8) == objLJFF) {
                        C1C7U.LIZIZ("EditorProMultiMusicComponent@16ec.restoreMusicInfoFromOldDraft$1");
                        return objLJFF;
                    }
                }
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("EditorProMultiMusicComponent@16ec.restoreMusicInfoFromOldDraft$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
