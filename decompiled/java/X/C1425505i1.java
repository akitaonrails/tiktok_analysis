package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.gamora.editor.lyric.api.ILyricMiniDraftService;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS116S1100000_2;
import njp.a;

/* JADX INFO: renamed from: X.05i1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.lyric.component.LyricStickerEffectDataLogicComponent$loadMiniDraft$2", f = "LyricStickerEffectDataLogicComponent.kt", l = {1076}, m = "invokeSuspend")
public final class C1425505i1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super AnonymousClass0957<? extends C1425705i3>>, Object> {
    public ILyricMiniDraftService LL;
    public Object LLILLJJLI;
    public InterfaceC383701eN LLILLL;
    public C0EQZ LLILZ;
    public int LLILZIL;
    public /* synthetic */ Object LLILZLL;
    public final /* synthetic */ C0EQZ LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ List<AVMusic> LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1425505i1(C0EQZ c0eqz, String str, List<? extends AVMusic> list, InterfaceC1364105Vn<? super C1425505i1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLIZ = c0eqz;
        this.LLIZLLLIL = str;
        this.LLJ = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1425505i1 c1425505i1 = new C1425505i1(this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
        c1425505i1.LLILZLL = obj;
        return c1425505i1;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC497601wk interfaceC497601wk;
        ILyricMiniDraftService iLyricMiniDraftServiceO3;
        String strZ1;
        C0EQZ c0eqz;
        InterfaceC383701eN interfaceC383701eN;
        C1C7U.LIZ("LyricStickerEffectDataLogicComponent@6232.loadMiniDraft$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILZIL;
        if (i != 0) {
            if (i == 1) {
                c0eqz = this.LLILZ;
                interfaceC383701eN = this.LLILLL;
                strZ1 = (String) this.LLILLJJLI;
                iLyricMiniDraftServiceO3 = this.LL;
                interfaceC497601wk = (InterfaceC497601wk) this.LLILZLL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            interfaceC497601wk = (InterfaceC497601wk) this.LLILZLL;
            iLyricMiniDraftServiceO3 = this.LLIZ.O3();
            if (iLyricMiniDraftServiceO3 == null) {
                C1C7U.LIZIZ("LyricStickerEffectDataLogicComponent@6232.loadMiniDraft$2");
                return null;
            }
            strZ1 = this.LLIZ.Z1(this.LLIZLLLIL, this.LLJ);
            AnonymousClass0957<C1425705i3> anonymousClass0957 = this.LLIZ.LLILZ.get(strZ1);
            if (anonymousClass0957 != null) {
                C1C7U.LIZIZ("LyricStickerEffectDataLogicComponent@6232.loadMiniDraft$2");
                return anonymousClass0957;
            }
            c0eqz = this.LLIZ;
            interfaceC383701eN = c0eqz.LLILZIL;
            this.LLILZLL = interfaceC497601wk;
            this.LL = iLyricMiniDraftServiceO3;
            this.LLILLJJLI = strZ1;
            this.LLILLL = interfaceC383701eN;
            this.LLILZ = c0eqz;
            this.LLILZIL = 1;
            if (interfaceC383701eN.LIZLLL(null, this) == objLJFF) {
                C1C7U.LIZIZ("LyricStickerEffectDataLogicComponent@6232.loadMiniDraft$2");
                return objLJFF;
            }
        }
        try {
            C1425705i3 c1425705i3 = c0eqz.LLILZLL.get(strZ1);
            interfaceC383701eN.LIZIZ(null);
            if (c1425705i3 != null) {
                C099G c099gLIZIZ = C23250099c.LIZIZ(interfaceC497601wk, null, null, new C1425605i2(c1425705i3, null), 3);
                C1C7U.LIZIZ("LyricStickerEffectDataLogicComponent@6232.loadMiniDraft$2");
                return c099gLIZIZ;
            }
            C099G c099gLIZIZ2 = C23250099c.LIZIZ(interfaceC497601wk, null, null, new C1425405i0(this.LLIZ, this.LLJ, iLyricMiniDraftServiceO3, this.LLIZLLLIL, strZ1, null), 3);
            this.LLIZ.LLILZ.put(strZ1, c099gLIZIZ2);
            c099gLIZIZ2.LJII(new AwS116S1100000_2(this.LLIZ, strZ1, 5));
            C1C7U.LIZIZ("LyricStickerEffectDataLogicComponent@6232.loadMiniDraft$2");
            return c099gLIZIZ2;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            interfaceC383701eN.LIZIZ(null);
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super AnonymousClass0957<? extends C1425705i3>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
