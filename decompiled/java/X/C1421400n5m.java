package X;

import com.ss.android.ugc.aweme.creative.model.stickers.PovItemInfo;
import com.ss.android.ugc.gamora.editor.sticker.pov.api.PovResponse;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0n5m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1421400n5m extends C09AY implements Function1<PovResponse, Unit> {
    public final /* synthetic */ Function1<Integer, Unit> LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ Function1<PovResponse, Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1421400n5m(long j, long j2, Function1 function1, Function1 function12, boolean z) {
        super(1);
        this.LL = function1;
        this.LLILLJJLI = j;
        this.LLILLL = z;
        this.LLILZ = j2;
        this.LLILZIL = function12;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(PovResponse povResponse) {
        String str;
        int size;
        int iIntValue;
        List<PovItemInfo> listLJJJJI;
        List listLL;
        String strLJJJLL;
        PovResponse povResponse2 = povResponse;
        int iIntValue2 = 0;
        if (povResponse2 != null) {
            long j = this.LLILLJJLI;
            boolean z = this.LLILLL;
            long j2 = this.LLILZ;
            Function1<Integer, Unit> function1 = this.LL;
            Function1<PovResponse, Unit> function12 = this.LLILZIL;
            if (z) {
                str = "fetch_pov";
            } else {
                str = "load_more_pov";
            }
            C1421380n5k.LJ(j, str, povResponse2);
            C1421570n63 c1421570n63 = C1421570n63.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("gptTime:");
            sbLIZ.append(System.currentTimeMillis() - j2);
            C201955140j.LIZJ(c1421570n63, C2188811AlT.LIZIZ(sbLIZ));
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
                    function12.invoke(new PovResponse(povResponse2.statusCode, povResponse2.statusMessage, listLJJJJI, null, povResponse2.extraParams));
                }
            }
        } else {
            this.LL.invoke(0);
        }
        return Unit.LIZ;
    }
}
