package com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.editor.cover;

import X.C01GW;
import X.C1119170fEJ;
import X.C1324720kZq;
import X.C168Q;
import X.C16F5;
import X.C19F0;
import X.C20370614nI;
import X.C20371514nR;
import X.C20411714tv;
import X.C20736316Cj;
import X.C20743516Fd;
import X.C21505619Eg;
import X.C452501pT;
import X.C497740JfY;
import X.C500260Jjc;
import X.C786410Ut5;
import X.C915190ZvJ;
import X.C978360bZC;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.activity.result.ActivityResult;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookSheetFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.editor.BasePlaybookEditorViewModel;
import com.bytedance.android.live.liveinteract.multilive.model.MaterialsGetImagesParams;
import com.bytedance.android.livesdkapi.host.IHostCreativeTool;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.AwS610S0100000_31;
import kotlin.jvm.internal.AwS645S0100000_31;
import webcast.data.multi_guest_play.PlayImage;

/* JADX INFO: loaded from: classes32.dex */
public final class PlaybookEditorCoverDialog extends BasePlaybookSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyImJDElLjo2OzE6emE+KSwiZzHELIOS8/KTxiOSMyMScjJiR9KyohJCA9ZiAoIDs8OmsvJjk2OmscJS4qKiojIgo3ITEjOww8PiA+DSYyJCor";
    public final BasePlaybookEditorViewModel LLJZIJLIL;
    public final Function0<Long> LLL;
    public final Function0<String> LLLF;
    public final Function2<String, String, Unit> LLLFF;
    public final Function1<Integer, Unit> LLLFFI;
    public final Function1<String, Unit> LLLFZ;
    public List<PlayImage> LLLII;
    public C16F5 LLLIIII;
    public final List<C1324720kZq> LLLI = new ArrayList();
    public final C01GW LLLIIIIL = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(470));
    public final C01GW LLLIIIL = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(469));
    public final C19F0<Intent> LLLIIL = registerForActivityResult(new C21505619Eg(), new C168Q() { // from class: X.14ul
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // X.C168Q
        public final void LIZ(Object obj) {
            List<String> listHandleGalleryResult;
            Object objLJJJJZI;
            ActivityResult activityResult = (ActivityResult) obj;
            if (activityResult.resultCode == -1) {
                IHostCreativeTool iHostCreativeTool = (IHostCreativeTool) this.LIZ.LLLIIIIL.getValue();
                if (iHostCreativeTool != null) {
                    listHandleGalleryResult = iHostCreativeTool.handleGalleryResult(activityResult.data);
                } else {
                    listHandleGalleryResult = null;
                }
                Function1<String, Unit> function1 = this.LIZ.LLLFZ;
                if (listHandleGalleryResult == null || (objLJJJJZI = C13LP.LJJJJZI(listHandleGalleryResult)) == null) {
                    objLJJJJZI = "";
                }
                function1.invoke(objLJJJJZI);
            }
        }
    });

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookSheetFragment
    public final int getLayoutId() {
        return R.layout.haq;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C1119170fEJ gS() {
        C1119170fEJ c1119170fEJ = new C1119170fEJ();
        c1119170fEJ.LIZ(C497740JfY.LJIJI(2131854032));
        c1119170fEJ.LJI = false;
        return c1119170fEJ;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookSheetFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        ((ArrayList) this.LLLI).clear();
        ((IHostCreativeTool) this.LLLIIIIL.getValue()).releaseGalleryModule();
    }

    public final void BS(boolean z) {
        float f;
        C16F5 c16f5 = this.LLLIIII;
        if (c16f5 != null) {
            c16f5.setEnabled(z);
            if (z) {
                f = 1.0f;
            } else {
                f = 0.5f;
            }
            C786410Ut5.k5(c16f5, f);
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final int QM(Context context) {
        return C20736316Cj.LIZIZ(R.attr.exw, context);
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookSheetFragment, com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptionsIS = super.iS(context);
        sheetOptionsIS.canceledOnTouchOutside = true;
        sheetOptionsIS.LIZ(1, null);
        return sheetOptionsIS;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final void x1(int i) {
        this.LLLFFI.invoke(Integer.valueOf(i));
    }

    public final void ES(int i, View view) {
        View viewFindViewById = view.findViewById(i);
        if (viewFindViewById != null) {
            ((ArrayList) this.LLLI).add(viewFindViewById);
            C500260Jjc.LJLIIIL(500L, viewFindViewById, new AwS610S0100000_31(this, 479));
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        BS(false);
        BasePlaybookEditorViewModel basePlaybookEditorViewModel = this.LLJZIJLIL;
        MaterialsGetImagesParams materialsGetImagesParams = new MaterialsGetImagesParams();
        materialsGetImagesParams.getType = 1;
        materialsGetImagesParams.count = 12;
        basePlaybookEditorViewModel.wQ2(materialsGetImagesParams, new C20411714tv(this));
        View viewFindViewById = view.findViewById(R.id.f4v);
        if (viewFindViewById != null) {
            C500260Jjc.LJLIIIL(500L, viewFindViewById, new AwS610S0100000_31(this, 34));
        }
        C16F5 c16f5 = (C16F5) view.findViewById(R.id.qpp);
        if (c16f5 != null) {
            C20743516Fd c20743516FdLIZLLL = C20736316Cj.LIZLLL(R.attr.e9l, c16f5.getContext());
            if (c20743516FdLIZLLL != null) {
                c20743516FdLIZLLL.setTint(C497740JfY.LIZLLL(R.attr.ezq, c16f5.getContext()));
                c20743516FdLIZLLL.setBounds(0, 0, (int) C497740JfY.LIZIZ(16.0f), (int) C497740JfY.LIZIZ(16.0f));
            }
            c16f5.setCompoundDrawables(c20743516FdLIZLLL, null, null, null);
            c16f5.setCompoundDrawablePadding((int) C497740JfY.LIZIZ(4.0f));
            this.LLLIIII = c16f5;
            C500260Jjc.LJLIIIL(500L, c16f5, new AwS610S0100000_31(this, 35));
        }
        ES(R.id.f4b, view);
        ES(R.id.f4c, view);
        ES(R.id.f4d, view);
        ES(R.id.f4e, view);
        ES(R.id.f4f, view);
        ES(R.id.f4g, view);
        ES(R.id.f4h, view);
        ES(R.id.f4i, view);
        ES(R.id.f4j, view);
        ES(R.id.f4k, view);
        ES(R.id.f4l, view);
        ES(R.id.f4m, view);
        C915190ZvJ c915190ZvJ = C978360bZC.LIZJ;
        C978360bZC.LJIJJLI(this.LLL.invoke(), "change_cover", this.LLLF.invoke(), null, false);
    }

    public PlaybookEditorCoverDialog(BasePlaybookEditorViewModel basePlaybookEditorViewModel, C20371514nR c20371514nR, C20370614nI c20370614nI, AwS645S0100000_31 awS645S0100000_31, AwS610S0100000_31 awS610S0100000_31, AwS610S0100000_31 awS610S0100000_312) {
        this.LLJZIJLIL = basePlaybookEditorViewModel;
        this.LLL = c20371514nR;
        this.LLLF = c20370614nI;
        this.LLLFF = awS645S0100000_31;
        this.LLLFFI = awS610S0100000_31;
        this.LLLFZ = awS610S0100000_312;
    }
}
