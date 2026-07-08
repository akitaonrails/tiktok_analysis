package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import avg.f;
import com.bytedance.android.livesdk.comp.api.pcs.data.setting.LivePcsFontDownloadOnDemandSetting;
import com.bytedance.android.livesdk.model.BoardItemTransform;
import com.bytedance.android.livesdk.model.RichTextContent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import mf.a;

/* JADX INFO: renamed from: X.0xNk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1816940xNk extends AbstractC1817020xNs {
    public final AttributeSet LLJJIJIIJIL;
    public RichTextContent LLJJIJIL;
    public final C394501g7 LLJJJ;
    public C1838450xwR LLJJJIL;

    @Override // X.AbstractC1817020xNs, X.InterfaceC395901gL
    public int getLayoutId() {
        return R.layout.g22;
    }

    @Override // X.AbstractC1817020xNs
    public final void LJIILJJIL() {
        if (LivePcsFontDownloadOnDemandSetting.INSTANCE.getValue()) {
            RichTextContent richTextContent = this.LLJJIJIL;
            if (richTextContent == null) {
                return;
            }
            C1839560xyE.LIZIZ(new C1816970xNn(getHostRoomId(), getGroupId(), getBoardId(), this, richTextContent, C00GZ.LIZ(richTextContent)));
            return;
        }
        final C1816980xNo c1816980xNo = new C1816980xNo(this);
        if (((ArrayList) C1839560xyE.LIZLLL()).isEmpty()) {
            AbstractC19484711Kz.LJII(new C1839600xyI(true)).LJJ(C1701940uOG.LIZIZ()).LJJIIZ(new C09JN() { // from class: X.00RX
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("BoardFontStyleManager@c21c.isFontAvailable$1");
                    if (((List) obj) != null && (!r4.isEmpty())) {
                        c1816980xNo.invoke(Boolean.TRUE);
                    }
                    C1C7U.LIZIZ("BoardFontStyleManager@c21c.isFontAvailable$1");
                }
            }, new C09JN() { // from class: X.00M5
                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    C1C7U.LIZ("BoardFontStyleManager@c21c.isFontAvailable$2");
                    C1C7U.LIZIZ("BoardFontStyleManager@c21c.isFontAvailable$2");
                }
            });
        } else {
            c1816980xNo.invoke(Boolean.TRUE);
        }
    }

    @Override // X.AbstractC1817020xNs
    public final void LJIIIZ() {
        View contentView = getContentView();
        C1838450xwR c1838450xwR = contentView != null ? (C1838450xwR) contentView.findViewById(R.id.c6f) : null;
        this.LLJJJIL = c1838450xwR;
        if (c1838450xwR != null) {
            View.OnClickListener fVar = new View.OnClickListener() { // from class: X.0xNp
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.LL.getOnClick().invoke();
                }
            };
            if (C1848410yCV.LIZ) {
                fVar = new f(fVar);
            }
            a aVar = new a(fVar);
            if (C2213981Bky.LIZIZ.isOffline()) {
                C2211941Bhg.LIZ.injectViewListener(c1838450xwR);
            }
            c1838450xwR.setOnClickListener(aVar);
        }
    }

    @Override // X.AbstractC1817020xNs
    public final void LJIILIIL() {
        C1838450xwR c1838450xwR;
        View contentView = getContentView();
        if (contentView == null || (c1838450xwR = this.LLJJJIL) == null) {
            return;
        }
        getConfig().LJIIL = contentView.getX() - c1838450xwR.getX();
        getConfig().LJIILJJIL = (c1838450xwR.getX() + c1838450xwR.getWidth()) - (contentView.getX() + contentView.getWidth());
    }

    @Override // X.AbstractC1817020xNs
    public long getCurrentBoardIdentifier() {
        return getBoardId();
    }

    public final AttributeSet getAttrs() {
        return this.LLJJIJIIJIL;
    }

    @Override // X.AbstractC1817020xNs, X.InterfaceC395901gL
    public C394501g7 getConfig() {
        return this.LLJJJ;
    }

    public final RichTextContent getRichTextContent() {
        return this.LLJJIJIL;
    }

    public C1816940xNk(Context context) {
        super(context, null);
        this.LLJJIJIIJIL = null;
        EnumC389301fH enumC389301fH = EnumC389301fH.WIDGET;
        C1546210qL5.LIZ.getClass();
        this.LLJJJ = new C394501g7(enumC389301fH, true, true, false, C1546210qL5.LIZ(285), 1073708954);
    }

    public final void LJIILL(RichTextContent richTextContent) {
        String str;
        if (richTextContent == null) {
            return;
        }
        try {
            C229200uY c229200uYLIZ = new C049900Gb(richTextContent).LIZ();
            C1838450xwR c1838450xwR = this.LLJJJIL;
            if (c1838450xwR != null) {
                c1838450xwR.i0(c229200uYLIZ, false);
            }
            long hostRoomId = getHostRoomId();
            if (hostRoomId > 0) {
                long groupId = getGroupId();
                long boardId = getBoardId();
                List<String> listLIZ = C00GZ.LIZ(richTextContent);
                if (!listLIZ.isEmpty()) {
                    String strLJIIJ = C1839560xyE.LJIIJ("default");
                    Iterator<String> it2 = listLIZ.iterator();
                    while (it2.hasNext()) {
                        String strLJIIJ2 = C1839560xyE.LJIIJ(it2.next());
                        if (C1839560xyE.LJFF(strLJIIJ2)) {
                            str = strLJIIJ2;
                        } else {
                            str = strLJIIJ;
                        }
                        try {
                            C1145500fum c1145500fumLJI = C1145410fud.LJI(hostRoomId, groupId);
                            if (c1145500fumLJI != null) {
                                c1145500fumLJI.LJIIZILJ(boardId, strLJIIJ2, str);
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                        }
                    }
                }
            }
            long hostRoomId2 = getHostRoomId();
            long groupId2 = getGroupId();
            long boardId2 = getBoardId();
            try {
                C1145500fum c1145500fumLJI2 = C1145410fud.LJI(hostRoomId2, groupId2);
                if (c1145500fumLJI2 != null) {
                    c1145500fumLJI2.LJII(boardId2);
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
            }
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
            long hostRoomId3 = getHostRoomId();
            long groupId3 = getGroupId();
            long boardId3 = getBoardId();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("dsl_parse_fail:");
            sbLIZ.append(th3.getMessage());
            C1145410fud.LIZJ(-56, hostRoomId3, groupId3, boardId3, C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public final void setRichTextContent(RichTextContent richTextContent) {
        this.LLJJIJIL = richTextContent;
    }

    @Override // X.AbstractC1817020xNs
    public final void LJIIJ(C1816930xNj c1816930xNj, DataChannel dataChannel) {
        float fFloatValue;
        this.LLJJIJIL = c1816930xNj.LIZ.richTextContent;
        C394501g7 config = getConfig();
        BoardItemTransform boardItemTransform = c1816930xNj.LIZ.transform;
        Float fValueOf = null;
        if (boardItemTransform != null) {
            fValueOf = Float.valueOf(boardItemTransform.scale);
        }
        if (Boolean.valueOf(!Intrinsics.LIZLLL(fValueOf, 0.0f)).booleanValue() && fValueOf != null) {
            fFloatValue = fValueOf.floatValue();
        } else {
            fFloatValue = 1.0f;
        }
        config.LJJ = C13LZ.LIZLLL(fFloatValue, 0.66f, 1.5f);
        config.LJJI = c1816930xNj.LIZIZ;
        config.LJFF = c1816930xNj.LIZJ;
        config.LJJII = C488201vE.LIZ(c1816930xNj.LIZ, C488601vI.LIZ());
        config.LJJIII = c1816930xNj.LIZLLL;
        super.LJIIJ(c1816930xNj, dataChannel);
    }
}
