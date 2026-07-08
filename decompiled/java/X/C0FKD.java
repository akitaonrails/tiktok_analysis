package X;

import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextFontModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextTemplateModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.render.TextTemplateParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS134S0400000_5;
import kotlin.jvm.internal.AwS371S0200000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS56S1000000_5;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0FKD, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FKD implements InterfaceC388390FKr {
    public final C388170FJv LIZ;
    public final C385340F8y LIZIZ;
    public final C1664680tQA<TextStickerModel> LIZJ;
    public final C0FGA LIZLLL;
    public final LifecycleOwner LJ;
    public final FrameLayout LJFF;
    public final C388200FJy LJI;
    public boolean LJII;
    public InterfaceC388360FKo LJIIIIZZ;

    @Override // X.InterfaceC388390FKr
    public final int LLZ() {
        return this.LIZ.getLastOpenKeyBoardHeight();
    }

    @Override // X.InterfaceC388390FKr
    public final String LLZIL() {
        return this.LIZJ.LIZ.getTextStr();
    }

    @Override // X.InterfaceC388390FKr
    public final void LLZL() {
        this.LIZ.LJJIIJZLJL();
    }

    @Override // X.InterfaceC388390FKr
    public final Rect LLZZLLIL() {
        Rect rect = new Rect();
        this.LIZIZ.getGlobalVisibleRect(rect);
        return rect;
    }

    @Override // X.InterfaceC388390FKr
    public final void LLZZJLIL() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cancelTextTemplate: isNewTextTemplate=");
        sbLIZ.append(this.LIZJ.LIZ.getTextTemplateModel().enableTextTemplate);
        sbLIZ.append(" textStr=");
        sbLIZ.append(this.LIZJ.LIZ.getTextStr());
        C0F8J.LIZ("inspiration", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LIZJ.LIZ.getTextTemplateModel().enableTextTemplate) {
            C01TT.LIZIZ(200L, new AwS549S0100000_5(this, 1648));
            this.LIZJ.LIZLLL(AFwS234S0000000_5.get$arr$(585), true);
            this.LIZ.LJJIIZ();
        }
    }

    @Override // X.InterfaceC388390FKr
    public final C1664680tQA<TextStickerModel> LLZLLIL() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC388390FKr
    public final void LLZILL(String str) {
        if (Intrinsics.LJFF(str, "") && this.LIZJ.LIZ.getTextTemplateModel().useDefaultText) {
            this.LIZJ.LIZ.getTextTemplateModel().useDefaultText = false;
            this.LIZJ.LIZLLL(AFwS234S0000000_5.get$arr$(586), true);
        }
        this.LIZJ.LIZ.getTextTemplateModel().useDefaultText = false;
        this.LIZJ.LIZLLL(new AwS56S1000000_5(str, 20), true);
    }

    @Override // X.InterfaceC388390FKr
    public final void LLZLL(String str) {
        this.LIZ.LJIJI(str);
    }

    @Override // X.InterfaceC388390FKr
    public final void LLZLLLL(String str) {
        if (this.LIZJ.LIZ.getTextStr().length() == 0) {
            this.LIZJ.LIZ.getTextTemplateModel().useDefaultText = true;
            this.LIZJ.LIZ.getTextTemplateModel().defaultText = str;
        }
    }

    @Override // X.InterfaceC388390FKr
    public final void LLZZ(C0FKA c0fka) {
        this.LJIIIIZZ = c0fka;
    }

    @Override // X.InterfaceC388390FKr
    public final void sw(boolean z) {
        C388170FJv c388170FJv = this.LIZ;
        c388170FJv.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("adjustConfigView: ");
        sbLIZ.append(z);
        C0F8J.LIZ("inspiration", C2188811AlT.LIZIZ(sbLIZ));
        if (z) {
            View view = c388170FJv.LLLIZZ;
            if (view != null) {
                C786410Ut5.ed(view, -C814420VxA.LIZIZ(C418440Gaw.LIZIZ(80)));
                return;
            }
            return;
        }
        View view2 = c388170FJv.LLLIZZ;
        if (view2 == null) {
            return;
        }
        C786410Ut5.ed(view2, -C814420VxA.LIZIZ(C418440Gaw.LIZIZ(60)));
    }

    @Override // X.InterfaceC388390FKr
    public final void LLZLI(boolean z, int i, TextTemplateModel textTemplateModel, TextFontModel textFontModel, Function1<? super TextTemplateParams, Unit> function1) {
        TextFontModel textFontModelLIZ = textFontModel;
        if (z) {
            TextTemplateModel textTemplateModel2 = this.LIZJ.LIZ.getTextTemplateModel();
            if (textTemplateModel2.isGroupTextTemplates) {
                textTemplateModel2.editState.resetDefaultState();
            } else {
                textTemplateModel2.useDefaultFont = true;
                textTemplateModel2.useDefaultAlign = true;
                textTemplateModel2.useDefaultColor = true;
            }
            this.LJI.LJIIIIZZ.refresh();
            if (!textTemplateModel.isNewTextTemplate) {
                this.LIZJ.LIZLLL(AFwS234S0000000_5.get$arr$(587), true);
            }
        }
        this.LIZJ.LIZLLL(AFwS234S0000000_5.get$arr$(588), true);
        if (z && this.LIZJ.LIZ.getTextTemplateModel().useDefaultFont) {
            if (textFontModelLIZ == null) {
                TextFontModel fontModel = this.LIZJ.LIZ.getFontModel();
                String str = textTemplateModel.defaultFontID;
                String str2 = textTemplateModel.defaultFontPath;
                textFontModelLIZ = TextFontModel.LIZ(fontModel, str, null, null, null, null, null, 0, 0, a0.LJJLJLI(str2, "/", ""), str2, false, false, 0, 15614);
            }
        } else {
            textFontModelLIZ = TextFontModel.LIZ(this.LIZJ.LIZ.getFontModel(), null, null, null, null, null, null, 0, 0, null, null, false, false, 0, 16383);
        }
        this.LIZJ.LIZLLL(new AwS584S0100000_5(textFontModelLIZ, 1179), true);
        C0FGA c0fga = this.LIZLLL;
        Function1<? super TextTemplateParams, Unit> function12 = function1;
        if (c0fga != null && !c0fga.LJII()) {
            function12 = function12;
            c0fga.LJIIJ(this.LJFF, this.LJ, this.LIZJ, i, new AwS134S0400000_5(this, (C0FKD) c0fga, (C0FGA) function12, (Function1<? super TextTemplateParams, Unit>) textTemplateModel, (TextTemplateModel) 10));
            c0fga.LJ(new AwS549S0100000_5(this, 1649));
        }
        if (this.LJII) {
            C0FGA c0fga2 = this.LIZLLL;
            if (c0fga2 != null) {
                c0fga2.LIZIZ(new AwS371S0200000_5((Function1) function12, (Function1<? super TextTemplateParams, Unit>) this, (C0FKD) textTemplateModel, (TextTemplateModel) 303));
            }
            C0FGA c0fga3 = this.LIZLLL;
            if (c0fga3 != null) {
                c0fga3.resume();
            }
            C786410Ut5.c2(this.LIZIZ, 4);
            C0F8J.LIZ("inspiration", "textStickerView.visibility = View.INVISIBLE2");
            this.LIZJ.LIZLLL(AFwS234S0000000_5.get$arr$(589), true);
            this.LIZJ.LIZLLL(new AwS584S0100000_5(textTemplateModel, 1181), true);
        }
    }

    public C0FKD(C388170FJv c388170FJv, C385340F8y c385340F8y, C1664680tQA c1664680tQA, C0FGA c0fga, LifecycleOwner lifecycleOwner, FrameLayout frameLayout, C388200FJy c388200FJy) {
        this.LIZ = c388170FJv;
        this.LIZIZ = c385340F8y;
        this.LIZJ = c1664680tQA;
        this.LIZLLL = c0fga;
        this.LJ = lifecycleOwner;
        this.LJFF = frameLayout;
        this.LJI = c388200FJy;
    }
}
