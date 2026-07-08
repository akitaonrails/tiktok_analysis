package com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.editor.more;

import X.C12ES;
import X.C20736316Cj;
import X.C21411818qq;
import X.C500260Jjc;
import X.C511901z3;
import X.C5183020f;
import X.C786410Ut5;
import X.ViewOnClickListenerC512201z6;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAnchorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookSheetFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS432S0200000_31;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.AwS610S0100000_31;
import kotlin.jvm.internal.AwS645S0100000_31;
import webcast.data.multi_guest_play.Playbook;
import webcast.data.multi_guest_play.PlaybookContent;

/* JADX INFO: loaded from: classes.dex */
public final class PlaybookEditorMoreDialog extends BasePlaybookSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyImJDElLjo2OzE6emE+KSwiZzHELIOS8/KTxiOSMyMScjJiR9KyohJCA9ZiAoIDs8OmshJj02ZhUgKDYxJyonDCs6PCo+BCAhLQElKCM8Lw==";
    public final Context LLJZIJLIL;
    public final Playbook LLL;
    public final BasePlaybookViewModel LLLF;
    public final String LLLFF;
    public final Function1<Integer, Unit> LLLFFI;
    public final Function2<Boolean, Playbook, Unit> LLLFZ;
    public final Function0<Unit> LLLI;
    public final Function0<Unit> LLLII;
    public final Function0<Boolean> LLLIIII;
    public final Function0<Unit> LLLIIIIL;
    public final Function0<Unit> LLLIIIL;
    public final Function0<Unit> LLLIIL;

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookSheetFragment
    public final int getLayoutId() {
        return R.layout.hay;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final int QM(Context context) {
        return C20736316Cj.LIZIZ(R.attr.exw, context);
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookSheetFragment, com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptionsIS = super.iS(context);
        sheetOptionsIS.canceledOnTouchOutside = true;
        sheetOptionsIS.LIZ(3, null);
        return sheetOptionsIS;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final void x1(int i) {
        this.LLLFFI.invoke(Integer.valueOf(i));
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        PlaybookAnchorViewModel playbookAnchorViewModel;
        MutableLiveData<Boolean> mutableLiveData;
        Boolean value;
        View viewFindViewById;
        boolean z;
        super.onViewCreated(view, bundle);
        View viewFindViewById2 = view.findViewById(R.id.qqy);
        if (viewFindViewById2 != null) {
            C500260Jjc.LJLJLJ(viewFindViewById2, !this.LLL.LIZ());
        }
        C21411818qq c21411818qq = (C21411818qq) view.findViewById(R.id.qr9);
        if (c21411818qq != null) {
            if (this.LLL.playbookVisibility == 2) {
                z = true;
            } else {
                z = false;
            }
            c21411818qq.setChecked(z);
            C786410Ut5.C7(c21411818qq, new C511901z3(this, 1));
        }
        View viewFindViewById3 = view.findViewById(R.id.qqw);
        if (viewFindViewById3 != null) {
            C500260Jjc.LJLIIIL(500L, viewFindViewById3, new C5183020f(this, 48));
            if (this.LLL.LIZ()) {
                C500260Jjc.LJLJL(0, viewFindViewById3);
            }
        }
        View viewFindViewById4 = view.findViewById(R.id.qqv);
        if (viewFindViewById4 != null) {
            C500260Jjc.LJLIIL(new ViewOnClickListenerC512201z6(this, 17), viewFindViewById4);
        }
        BasePlaybookViewModel basePlaybookViewModel = this.LLLF;
        if ((basePlaybookViewModel instanceof PlaybookAnchorViewModel) && (playbookAnchorViewModel = (PlaybookAnchorViewModel) basePlaybookViewModel) != null && (mutableLiveData = playbookAnchorViewModel.LLJIJIL) != null && (value = mutableLiveData.getValue()) != null && value.booleanValue()) {
            PlaybookContent playbookContent = this.LLL.content;
            if (playbookContent != null && playbookContent.contentStatus == 1) {
                View viewFindViewById5 = view.findViewById(R.id.qqx);
                if (viewFindViewById5 != null) {
                    C12ES.LJIILL(0, viewFindViewById5);
                    TextView textView = (TextView) view.findViewById(R.id.qr5);
                    if (textView != null) {
                        textView.setText("Pass review");
                    }
                    C500260Jjc.LJLIIL(new ViewOnClickListenerC512201z6(this, 18), viewFindViewById5);
                }
                View viewFindViewById6 = view.findViewById(R.id.qqz);
                if (viewFindViewById6 != null) {
                    C12ES.LJIILL(0, viewFindViewById6);
                    TextView textView2 = (TextView) view.findViewById(R.id.qr8);
                    if (textView2 != null) {
                        textView2.setText("Reject review");
                    }
                    C500260Jjc.LJLIIL(new ViewOnClickListenerC512201z6(this, 19), viewFindViewById6);
                }
            }
            PlaybookContent playbookContent2 = this.LLL.content;
            if (playbookContent2 != null) {
                if ((playbookContent2.contentStatus == 1 || playbookContent2.contentStatus == 2) && (viewFindViewById = view.findViewById(R.id.qr0)) != null) {
                    C12ES.LJIILL(0, viewFindViewById);
                    TextView textView3 = (TextView) view.findViewById(R.id.qra);
                    if (textView3 != null) {
                        textView3.setText("Trash review");
                    }
                    C500260Jjc.LJLIIL(new ViewOnClickListenerC512201z6(this, 20), viewFindViewById);
                }
            }
        }
    }

    public PlaybookEditorMoreDialog(Context context, Playbook playbook, BasePlaybookViewModel basePlaybookViewModel, String str, AwS610S0100000_31 awS610S0100000_31, AwS645S0100000_31 awS645S0100000_31, AwS432S0200000_31 awS432S0200000_31, AwS575S0100000_31 awS575S0100000_31, AwS575S0100000_31 awS575S0100000_312, AwS575S0100000_31 awS575S0100000_313, AwS575S0100000_31 awS575S0100000_314, AwS575S0100000_31 awS575S0100000_315) {
        this.LLJZIJLIL = context;
        this.LLL = playbook;
        this.LLLF = basePlaybookViewModel;
        this.LLLFF = str;
        this.LLLFFI = awS610S0100000_31;
        this.LLLFZ = awS645S0100000_31;
        this.LLLI = awS432S0200000_31;
        this.LLLII = awS575S0100000_31;
        this.LLLIIII = awS575S0100000_312;
        this.LLLIIIIL = awS575S0100000_313;
        this.LLLIIIL = awS575S0100000_314;
        this.LLLIIL = awS575S0100000_315;
    }
}
