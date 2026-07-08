package X;

import com.ss.android.ugc.aweme.creative.model.stickers.PovItemInfo;
import com.ss.android.ugc.gamora.editor.sticker.pov.api.PovResponse;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0n5l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1421390n5l extends C09AY implements Function1<PovResponse, Unit> {
    public final /* synthetic */ C1421450n5r LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ Function1<Integer, Unit> LLILZ;
    public final /* synthetic */ Function1<PovResponse, Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1421390n5l(C1421450n5r c1421450n5r, long j, long j2, Function1<? super Integer, Unit> function1, Function1<? super PovResponse, Unit> function12) {
        super(1);
        this.LL = c1421450n5r;
        this.LLILLJJLI = j;
        this.LLILLL = j2;
        this.LLILZ = function1;
        this.LLILZIL = function12;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(PovResponse povResponse) {
        int size;
        int iIntValue;
        List<PovItemInfo> listLJJJJI;
        List listLL;
        String strLJJJLL;
        PovResponse povResponse2 = povResponse;
        int iIntValue2 = 0;
        if (povResponse2 != null) {
            long j = this.LLILLJJLI;
            long j2 = this.LLILLL;
            Function1<Integer, Unit> function1 = this.LLILZ;
            C1421450n5r c1421450n5r = this.LL;
            Function1<PovResponse, Unit> function12 = this.LLILZIL;
            C1421570n63 c1421570n63 = C1421570n63.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("gptTime:");
            sbLIZ.append(System.currentTimeMillis() - j);
            C201955140j.LIZJ(c1421570n63, C2188811AlT.LIZIZ(sbLIZ));
            C1421380n5k.LJ(j2, "fetch_pov", povResponse2);
            Integer num = povResponse2.statusCode;
            if (num != null && num.intValue() == 3019014) {
                function1.invoke(povResponse2.statusCode);
            } else {
                List<PovItemInfo> list = povResponse2.povInfoList;
                if (list != null) {
                    size = list.size();
                } else {
                    size = 0;
                }
                Integer num2 = povResponse2.tnsBlockCount;
                if (num2 != null) {
                    iIntValue = num2.intValue();
                } else {
                    iIntValue = 0;
                }
                if (size + iIntValue < C0C64.LJIILLIIL().LJIJ(31744, 10, "edit_text_pov_result_cnt_threshold", true)) {
                    Integer num3 = povResponse2.statusCode;
                    if (num3 != null) {
                        iIntValue2 = num3.intValue();
                    }
                    function1.invoke(Integer.valueOf(iIntValue2));
                } else {
                    List<PovItemInfo> list2 = povResponse2.povInfoList;
                    if (list2 != null && (listLL = C13LP.LL(C1697820uHc.LIZLLL(list2), C1421340n5g.LIZ())) != null) {
                        listLJJJJI = C13LP.LJJJJI(listLL);
                        if (listLJJJJI != null) {
                            for (PovItemInfo povItemInfo : listLJJJJI) {
                                String text = povItemInfo.getText();
                                if (text != null && (strLJJJLL = a0.LJJJLL("。", text)) != null) {
                                    if (u.LJJIIJZLJL(strLJJJLL, "POV:", true)) {
                                        strLJJJLL = strLJJJLL.substring(4);
                                    }
                                } else {
                                    strLJJJLL = null;
                                }
                                povItemInfo.setText(strLJJJLL);
                            }
                        }
                    } else {
                        listLJJJJI = null;
                    }
                    PovResponse povResponse3 = new PovResponse(povResponse2.statusCode, povResponse2.statusMessage, listLJJJJI, null, povResponse2.extraParams);
                    if (!c1421450n5r.LIZJ) {
                        function12.invoke(povResponse3);
                    }
                }
            }
            return Unit.LIZ;
        }
        C1421450n5r c1421450n5r2 = this.LL;
        Function1<Integer, Unit> function13 = this.LLILZ;
        if (!c1421450n5r2.LIZJ) {
            function13.invoke(0);
        }
        this.LL.LIZIZ = false;
        return Unit.LIZ;
    }
}
