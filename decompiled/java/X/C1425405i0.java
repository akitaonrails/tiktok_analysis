package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.gamora.editor.lyric.api.ILyricMiniDraftService;
import com.ss.android.ugc.gamora.editor.lyric.api.LyricMiniDraftItemData;
import com.ss.android.ugc.gamora.editor.lyric.api.LyricMiniDraftRespData;
import com.ss.ugc.android.editor.base.network.BaseResponse;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05i0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.lyric.component.LyricStickerEffectDataLogicComponent$loadMiniDraft$2$job$1", f = "LyricStickerEffectDataLogicComponent.kt", l = {553, 1088}, m = "invokeSuspend")
public final class C1425405i0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C1425705i3>, Object> {
    public long LL;
    public C1425705i3 LLILLJJLI;
    public InterfaceC383701eN LLILLL;
    public C0EQZ LLILZ;
    public Object LLILZIL;
    public int LLILZLL;
    public final /* synthetic */ C0EQZ LLIZ;
    public final /* synthetic */ List<AVMusic> LLIZLLLIL;
    public final /* synthetic */ ILyricMiniDraftService LLJ;
    public final /* synthetic */ String LLJI;
    public final /* synthetic */ String LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1425405i0(C0EQZ c0eqz, List<? extends AVMusic> list, ILyricMiniDraftService iLyricMiniDraftService, String str, String str2, InterfaceC1364105Vn<? super C1425405i0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLIZ = c0eqz;
        this.LLIZLLLIL = list;
        this.LLJ = iLyricMiniDraftService;
        this.LLJI = str;
        this.LLJIJIL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1425405i0(this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        long jLIZ;
        C1425705i3 c1425705i3W2;
        List<LyricMiniDraftItemData> list;
        C0EQZ c0eqz;
        InterfaceC383701eN interfaceC383701eN;
        Object obj2;
        LyricMiniDraftRespData data;
        Object objLIZIZ = obj;
        C1C7U.LIZ("LyricStickerEffectDataLogicComponent@6232.loadMiniDraft$2$job$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILZLL;
        boolean z = true;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    obj2 = this.LLILZIL;
                    c0eqz = this.LLILZ;
                    interfaceC383701eN = this.LLILLL;
                    c1425705i3W2 = this.LLILLJJLI;
                    C155000ia.LIZIZ(objLIZIZ);
                    try {
                        c0eqz.LLILZLL.put(obj2, c1425705i3W2);
                        interfaceC383701eN.LIZIZ(null);
                        C1C7U.LIZIZ("LyricStickerEffectDataLogicComponent@6232.loadMiniDraft$2$job$1");
                        return c1425705i3W2;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        interfaceC383701eN.LIZIZ(null);
                        throw th;
                    }
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jLIZ = this.LL;
            C155000ia.LIZIZ(objLIZIZ);
        } else {
            C155000ia.LIZIZ(objLIZIZ);
            ILyricMiniDraftService iLyricMiniDraftService = this.LLJ;
            String str = this.LLJI;
            List<AVMusic> list2 = this.LLIZLLLIL;
            C1302050jzH.LIZ.getClass();
            jLIZ = C1302050jzH.LIZ();
            List listLJJJJLI = C13LP.LJJJJLI(list2);
            HashSet hashSet = new HashSet();
            ArrayList arrayList = new ArrayList();
            for (Object obj3 : (ArrayList) listLJJJJLI) {
                if (hashSet.add(((AVMusic) obj3).getMusicId())) {
                    arrayList.add(obj3);
                }
            }
            this.LL = jLIZ;
            this.LLILZLL = 1;
            objLIZIZ = iLyricMiniDraftService.LIZIZ(arrayList, "lyrics_style", str, this);
            if (objLIZIZ == objLJFF) {
                C1C7U.LIZIZ("LyricStickerEffectDataLogicComponent@6232.loadMiniDraft$2$job$1");
                return objLJFF;
            }
        }
        C05XE c05xe = new C05XE(objLIZIZ, C1302080jzK.LIZJ(jLIZ), null);
        long jLJIIIZ = C19990113Jj.LJIIIZ(c05xe.LIZIZ);
        BaseResponse baseResponse = (BaseResponse) c05xe.LIZ;
        if (baseResponse == null) {
            C1366105Wh.LIZJ(EnumC1366205Wi.EVENT_TOOLS_LYRIC_MOTION_GEN_MINIDRAFT_REQUEST, false, jLJIIIZ, false, -999, "unknown_error");
        } else if (baseResponse.isSuccess()) {
            C1366105Wh.LIZJ(EnumC1366205Wi.EVENT_TOOLS_LYRIC_MOTION_GEN_MINIDRAFT_REQUEST, true, jLJIIIZ, false, 0, "");
        } else {
            EnumC1366205Wi enumC1366205Wi = EnumC1366205Wi.EVENT_TOOLS_LYRIC_MOTION_GEN_MINIDRAFT_REQUEST;
            String message = baseResponse.getMessage();
            if (message == null) {
                message = "";
            }
            C1366105Wh.LIZJ(enumC1366205Wi, false, jLJIIIZ, false, -998, message);
        }
        c1425705i3W2 = this.LLIZ.W2(this.LLIZLLLIL, (C1425705i3) c05xe.LIZ);
        if (c1425705i3W2 != null && (data = c1425705i3W2.getData()) != null) {
            list = data.miniDraftList;
        } else {
            list = null;
        }
        if (list != null && !list.isEmpty()) {
            z = false;
        }
        if (!z) {
            c0eqz = this.LLIZ;
            interfaceC383701eN = c0eqz.LLILZIL;
            obj2 = this.LLJIJIL;
            this.LLILLJJLI = c1425705i3W2;
            this.LLILLL = interfaceC383701eN;
            this.LLILZ = c0eqz;
            this.LLILZIL = obj2;
            this.LLILZLL = 2;
            if (interfaceC383701eN.LIZLLL(null, this) == objLJFF) {
                C1C7U.LIZIZ("LyricStickerEffectDataLogicComponent@6232.loadMiniDraft$2$job$1");
                return objLJFF;
            }
            c0eqz.LLILZLL.put(obj2, c1425705i3W2);
            interfaceC383701eN.LIZIZ(null);
        }
        C1C7U.LIZIZ("LyricStickerEffectDataLogicComponent@6232.loadMiniDraft$2$job$1");
        return c1425705i3W2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C1425705i3> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
