package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveBoardsAudienceReportSettings;
import com.bytedance.android.livesdk.sei.BoardItemSeiData;
import com.bytedance.android.livesdk.sei.BoardPosSeiData;
import com.bytedance.android.livesdk.sei.BoardSizeSeiData;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01gY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.live.effect.board.PCSBoardEffectService$updateSei$1", f = "PCSBoardEffectService.kt", l = {595}, m = "invokeSuspend")
public final class C397201gY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C394101g3 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C397201gY(C394101g3 c394101g3, InterfaceC1364105Vn<? super C397201gY> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c394101g3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C397201gY(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C397301gZ boardSeiInfo;
        String json;
        AnonymousClass0956 anonymousClass0956LIZLLL;
        C1C7U.LIZ("PCSBoardEffectService@8a7a.updateSei$1");
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
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(200L, this) == objLJFF) {
                C1C7U.LIZIZ("PCSBoardEffectService@8a7a.updateSei$1");
                return objLJFF;
            }
        }
        C394101g3 c394101g3 = this.LLILLJJLI;
        Collection<InterfaceC395901gL> collectionValues = c394101g3.LJFF.values();
        ArrayList arrayList = new ArrayList();
        for (InterfaceC395901gL interfaceC395901gL : collectionValues) {
            float f = interfaceC395901gL.getConfig().LJIJJLI;
            float f2 = interfaceC395901gL.getConfig().LJIL;
            if (f > 0.0f && f2 > 0.0f) {
                arrayList.add(new BoardItemSeiData(new BoardPosSeiData(interfaceC395901gL.getConfig().LJIJI, interfaceC395901gL.getConfig().LJIJJ), new BoardSizeSeiData(f, f2), Boolean.valueOf(interfaceC395901gL.getConfig().LJJIII)));
            }
        }
        InterfaceC395901gL interfaceC395901gL2 = (InterfaceC395901gL) C13LP.LJJLIIIJJIZ(c394101g3.LJFF.values());
        if (interfaceC395901gL2 != null && (boardSeiInfo = interfaceC395901gL2.getBoardSeiInfo()) != null) {
            C769220UFk.LIZ.getClass();
            boardSeiInfo.LJIIL = C769220UFk.LIZIZ;
            boardSeiInfo.LJIILIIL = C769220UFk.LIZJ;
            boardSeiInfo.LJIILJJIL = arrayList;
            C456101q3 c456101q3 = C456101q3.LIZ;
            if (LiveBoardsAudienceReportSettings.enable()) {
                C456101q3.LJIIIZ = true;
                Long lLJIILIIL = C2095008Iq.LJIILIIL(boardSeiInfo.LIZ);
                if (lLJIILIIL != null && lLJIILIIL.longValue() > 0 && C456101q3.LJIIJ != lLJIILIIL.longValue()) {
                    C456101q3.LJIIJ = lLJIILIIL.longValue();
                    String str = boardSeiInfo.LIZ;
                    String str2 = boardSeiInfo.LIZJ;
                    String str3 = boardSeiInfo.LIZLLL;
                    String str4 = boardSeiInfo.LJ;
                    String str5 = boardSeiInfo.LIZIZ;
                    String str6 = boardSeiInfo.LJI;
                    String str7 = boardSeiInfo.LJII;
                    String str8 = boardSeiInfo.LJIIJ;
                    String str9 = boardSeiInfo.LJIIJJI;
                    int i2 = boardSeiInfo.LJIIL;
                    int i3 = boardSeiInfo.LJIILIIL;
                    List<BoardItemSeiData> list = boardSeiInfo.LJIILJJIL;
                    if (list != null) {
                        json = GsonProtectorUtils.toJson(C19748512Ol.LIZIZ, list);
                    } else {
                        json = null;
                    }
                    String strValueOf = String.valueOf(System.currentTimeMillis());
                    AnonymousClass0956 anonymousClass0956 = C456101q3.LJFF;
                    if (anonymousClass0956 != null) {
                        anonymousClass0956.LIZIZ(null);
                    }
                    C054G c054g = C456101q3.LJ;
                    if (c054g != null) {
                        anonymousClass0956LIZLLL = C23250099c.LIZLLL(c054g, C456101q3.LJI, null, new C456001q2(str, str2, str5, strValueOf, str3, str4, str6, boardSeiInfo, str7, str8, str9, i2, i3, json, null), 2);
                    } else {
                        anonymousClass0956LIZLLL = null;
                    }
                    C456101q3.LJFF = anonymousClass0956LIZLLL;
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(" liveStream?.addSeiField() intercept ");
                    sbLIZ.append(lLJIILIIL);
                    C20441214yg.LIZIZ("BoardEffectService", C2188811AlT.LIZIZ(sbLIZ));
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PCSBoardEffectService@8a7a.updateSei$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
