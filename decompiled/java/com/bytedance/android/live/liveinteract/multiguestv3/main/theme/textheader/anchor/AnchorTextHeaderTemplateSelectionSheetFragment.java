package com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.anchor;

import X.C01OF;
import X.C16FV;
import X.C786410Ut5;
import X.C946850akN;
import X.C972080bP4;
import X.EnumC952890au7;
import X.EnumC971610bOJ;
import X.InterfaceC971790bOb;
import Y.ACListenerS165S0100000_31;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.common.multicanvas.tools.MultiCanvasUtils;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.common.fragment.BaseTextHeaderSheetFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS466S0200000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class AnchorTextHeaderTemplateSelectionSheetFragment extends BaseTextHeaderSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyImJDElLjo2OzE6emE+KSwiZzs7LSgpZzHELIOSs2MDEkLC43LTdiKCEwICo+Zw49Ky0jOxs2MDEELC43LTcYLCIjJCQ4LBw2JCAvPSY8JhYkLConDjctLiI2JjE=";
    public final Function2<Integer, Context, Unit> LLL;

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.common.ui.BaseSheetFragment
    public final int layoutId() {
        return R.layout.hma;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.common.ui.BaseSheetFragment, com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final void x1(int i) {
        InterfaceC971790bOb interfaceC971790bObLIZIZ;
        super.x1(i);
        if (i == 2 && (interfaceC971790bObLIZIZ = C01OF.LIZIZ()) != null) {
            interfaceC971790bObLIZIZ.LJIIJJI();
        }
    }

    public AnchorTextHeaderTemplateSelectionSheetFragment(DataChannel dataChannel, AwS466S0200000_31 awS466S0200000_31) {
        super(dataChannel);
        this.LLL = awS466S0200000_31;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.common.ui.BaseSheetFragment, com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C972080bP4.LIZLLL("Initializing TextHeaderTemplateSelectionSheetFragment", "TextHeaderTemplateSelectionSheetFragment", 2);
        C972080bP4.LIZJ((C16FV) view.findViewById(R.id.xny), "ttlive_multi_guest_text_header_template_header_iv.png");
        C972080bP4.LIZJ((C16FV) view.findViewById(R.id.xo1), "ttlive_multi_guest_text_header_template_in_spot_iv.png");
        C786410Ut5.I7(new ACListenerS165S0100000_31(this, 32), view.findViewById(R.id.xnw));
        C786410Ut5.I7(new ACListenerS165S0100000_31(this, 33), view.findViewById(R.id.xnx));
        C786410Ut5.I7(new ACListenerS165S0100000_31(this, 34), view.findViewById(R.id.xo0));
        EnumC952890au7 enumC952890au7 = C946850akN.LIZIZ;
        EnumC971610bOJ enumC971610bOJ = EnumC971610bOJ.CREATE_PAGE;
        MultiCanvasUtils.LIZ.getClass();
        C946850akN.LJFF(MultiCanvasUtils.LJIIJJI(enumC952890au7), enumC971610bOJ, "");
    }
}
