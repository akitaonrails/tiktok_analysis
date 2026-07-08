package X;

import android.view.View;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.font.TextSelectFontStyleAssem;
import com.bytedance.android.livesdk.model.RichTextStyle;
import com.bytedance.android.livesdkapi.host.editor.board.BoardTextFontStyleData;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0xxs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1839340xxs extends C09AY implements Function2<UIAssem, C291001Au<? extends C229200uY>, Unit> {
    public final /* synthetic */ TextSelectFontStyleAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1839340xxs(TextSelectFontStyleAssem textSelectFontStyleAssem) {
        super(2);
        this.LL = textSelectFontStyleAssem;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(UIAssem uIAssem, C291001Au<? extends C229200uY> c291001Au) {
        String str;
        String str2;
        Object next;
        BoardTextFontStyleData fontData;
        String strLIZ;
        RichTextStyle richTextStyleLIZ;
        RichTextStyle richTextStyleLIZ2;
        C229200uY c229200uY = (C229200uY) c291001Au.LIZ;
        if (c229200uY != null && (richTextStyleLIZ2 = c229200uY.LIZ()) != null) {
            str = richTextStyleLIZ2.fontFamily;
        } else {
            str = null;
        }
        if (Intrinsics.LJFF(str, "")) {
            this.LL.hp();
        } else {
            final TextSelectFontStyleAssem textSelectFontStyleAssem = this.LL;
            if (c229200uY == null || (richTextStyleLIZ = c229200uY.LIZ()) == null || (str2 = richTextStyleLIZ.fontFamily) == null) {
                str2 = "TikTokSans";
            }
            textSelectFontStyleAssem.getClass();
            String strLJIIJ = C1839560xyE.LJIIJ(str2);
            Iterator it2 = ((ArrayList) textSelectFontStyleAssem.LLJJIJIIJIL).iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    BoardTextFontStyleData fontData2 = ((C1839330xxr) next).getFontData();
                    if (fontData2 != null) {
                        strLIZ = fontData2.LIZ();
                    } else {
                        strLIZ = null;
                    }
                    if (Intrinsics.LJFF(strLIZ, strLJIIJ)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            C1839330xxr c1839330xxr = (C1839330xxr) next;
            if (c1839330xxr != null && (fontData = c1839330xxr.getFontData()) != null && fontData.LIZ() != null) {
                String strLIZ2 = fontData.LIZ();
                if (strLIZ2 != null) {
                    C1839560xyE.LIZJ = strLIZ2;
                }
                HandlerHook.viewPost((View) textSelectFontStyleAssem.LLJJJJ.getValue(), new Runnable() { // from class: X.0uKk
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("TextSelectFontStyleAssem@11c7.selectInitialFont$2");
                        try {
                            textSelectFontStyleAssem.lp();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("TextSelectFontStyleAssem@11c7.selectInitialFont$2");
                    }
                });
                textSelectFontStyleAssem.ip().setState(new C1839390xxx(fontData));
            } else {
                textSelectFontStyleAssem.ip().setState(new C1839460xy4());
                textSelectFontStyleAssem.hp();
            }
        }
        return Unit.LIZ;
    }
}
