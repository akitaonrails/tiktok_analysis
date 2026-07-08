package X;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import avg.f;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.font.TextSelectFontStyleAssem;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.font.viewmodel.BoardTextSelectFontStyleViewModel;
import com.bytedance.android.livesdk.model.BoardItem;
import com.bytedance.android.livesdk.model.BoardItemStyle;
import com.bytedance.android.livesdkapi.host.editor.board.BoardTextFontStyleData;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import mf.a;

/* JADX INFO: renamed from: X.0xxq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1839320xxq extends C09AY implements Function2<UIAssem, List<BoardTextFontStyleData>, Unit> {
    public final /* synthetic */ TextSelectFontStyleAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1839320xxq(TextSelectFontStyleAssem textSelectFontStyleAssem) {
        super(2);
        this.LL = textSelectFontStyleAssem;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(UIAssem uIAssem, List<BoardTextFontStyleData> list) {
        List<String> list2;
        Object next;
        String strLIZ;
        Typeface typeface;
        Context context;
        List<BoardTextFontStyleData> list3 = list;
        final TextSelectFontStyleAssem textSelectFontStyleAssem = this.LL;
        if (((ViewGroup) textSelectFontStyleAssem.LLJJJJ.getValue()).getChildCount() <= 0 && (context = textSelectFontStyleAssem.getContext()) != null) {
            int i = 0;
            for (BoardTextFontStyleData boardTextFontStyleData : list3) {
                int i2 = i + 1;
                if (i >= 0) {
                    BoardTextFontStyleData boardTextFontStyleData2 = boardTextFontStyleData;
                    String strLIZ2 = boardTextFontStyleData2.LIZ();
                    if (strLIZ2 != null) {
                        final C1839330xxr c1839330xxr = new C1839330xxr(context);
                        c1839330xxr.LIZLLL(boardTextFontStyleData2);
                        c1839330xxr.setTextFontTypeLayoutBackground(0);
                        if (Intrinsics.LJFF(C1839560xyE.LJIIJ("default"), C1839560xyE.LJIIJ(C1839560xyE.LIZJ(textSelectFontStyleAssem.LLJJJ)))) {
                            if (i == 0 && c1839330xxr.LJ()) {
                                if (textSelectFontStyleAssem.LLJJJ == 1) {
                                    C1839560xyE.LIZLLL = strLIZ2;
                                } else {
                                    C1839560xyE.LIZJ = strLIZ2;
                                }
                                c1839330xxr.setTextFontTypeLayoutBackground(1);
                            }
                        } else {
                            String strLIZJ = C1839560xyE.LIZJ(textSelectFontStyleAssem.LLJJJ);
                            if (!TextUtils.isEmpty(strLIZJ) && Intrinsics.LJFF(strLIZJ, strLIZ2) && c1839330xxr.LJ()) {
                                c1839330xxr.setTextFontTypeLayoutBackground(1);
                            }
                        }
                        c1839330xxr.setTag(strLIZ2);
                        View.OnClickListener fVar = new View.OnClickListener() { // from class: X.0xxy
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                String strLIZ3;
                                BoardTextFontStyleData fontData = c1839330xxr.getFontData();
                                if (fontData != null && (strLIZ3 = fontData.LIZ()) != null) {
                                    textSelectFontStyleAssem.LLJJIJIL = strLIZ3;
                                }
                                if (c1839330xxr.LJFF()) {
                                    textSelectFontStyleAssem.kp(c1839330xxr.getFontData());
                                }
                            }
                        };
                        if (C1848410yCV.LIZ) {
                            fVar = new f(fVar);
                        }
                        a aVar = new a(fVar);
                        if (C2213981Bky.LIZIZ.isOffline()) {
                            C2211941Bhg.LIZ.injectViewListener(c1839330xxr);
                        }
                        c1839330xxr.setOnClickListener(aVar);
                        c1839330xxr.setDownloadCallback(new InterfaceC1839510xy9() { // from class: X.0xxz
                            @Override // X.InterfaceC1839510xy9
                            public final void LIZIZ(boolean z) {
                            }

                            @Override // X.InterfaceC1839510xy9
                            public final void LIZ(BoardTextFontStyleData boardTextFontStyleData3, boolean z) {
                                if (z && boardTextFontStyleData3 != null && Intrinsics.LJFF(boardTextFontStyleData3.LIZ(), textSelectFontStyleAssem.LLJJIJIL)) {
                                    textSelectFontStyleAssem.kp(boardTextFontStyleData3);
                                }
                            }
                        });
                        ((ArrayList) textSelectFontStyleAssem.LLJJIJIIJIL).add(c1839330xxr);
                        ((ViewGroup) textSelectFontStyleAssem.LLJJJJ.getValue()).addView(c1839330xxr);
                    }
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        BoardTextSelectFontStyleViewModel boardTextSelectFontStyleViewModelIp = this.LL.ip();
        this.LL.LLJJJJ.getValue();
        BoardItemStyle boardItemStyle = ((BoardItem) boardTextSelectFontStyleViewModelIp.LLILLJJLI.getValue()).style;
        if (boardItemStyle != null && (list2 = boardItemStyle.fonts) != null) {
            int i3 = 0;
            for (String str : list2) {
                int i4 = i3 + 1;
                if (i3 >= 0) {
                    String str2 = str;
                    C1839470xy5 c1839470xy5 = new C1839470xy5();
                    Iterator it2 = ((ArrayList) C1839560xyE.LIZLLL()).iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next = it2.next();
                            if (Intrinsics.LJFF(((BoardTextFontStyleData) next).LIZ(), C1839560xyE.LJIIJ(str2))) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    BoardTextFontStyleData boardTextFontStyleData3 = (BoardTextFontStyleData) next;
                    if (boardTextFontStyleData3 != null) {
                        String strLIZ3 = boardTextFontStyleData3.LIZ();
                        if (strLIZ3 != null) {
                            C1839560xyE.LIZJ = strLIZ3;
                        }
                        boardTextSelectFontStyleViewModelIp.setState(new C1839420xy0());
                    } else {
                        List listLIZLLL = C1839560xyE.LIZLLL();
                        if ((!((ArrayList) listLIZLLL).isEmpty()) && ((BoardTextFontStyleData) ListProtector.get(listLIZLLL, 0)).LIZIZ == 1 && (strLIZ = ((BoardTextFontStyleData) ListProtector.get(listLIZLLL, 0)).LIZ()) != null) {
                            C1839560xyE.LIZJ = strLIZ;
                        }
                        boardTextSelectFontStyleViewModelIp.setState(new C1839430xy1());
                    }
                    BoardTextFontStyleData boardTextFontStyleData4 = C1839560xyE.LIZ.get(C1839560xyE.LJIIJ(C1839560xyE.LIZJ(2)));
                    if (boardTextFontStyleData4 != null) {
                        C1817980xPQ c1817980xPQLIZ = C1839520xyA.LIZ(boardTextFontStyleData4);
                        ConcurrentHashMap<String, Typeface> concurrentHashMap = C1839560xyE.LIZIZ;
                        if (concurrentHashMap.get(C1839560xyE.LJIIJ(C1839560xyE.LIZJ)) != null) {
                            typeface = concurrentHashMap.get(C1839560xyE.LJIIJ(C1839560xyE.LIZJ));
                        } else {
                            typeface = null;
                        }
                        c1839470xy5.invoke(c1817980xPQLIZ, typeface);
                    }
                    i3 = i4;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        TextSelectFontStyleAssem textSelectFontStyleAssem2 = this.LL;
        AssemVMLazy assemVMLazy = textSelectFontStyleAssem2.LLJJIJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = TextSelectFontStyleAssem.LLJJJJJIL;
        C736680Sv4.LJIIIIZZ(textSelectFontStyleAssem2, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0xxk
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C2880019q) obj).LL;
            }
        }, null, new C1839340xxs(textSelectFontStyleAssem2), 6);
        return Unit.LIZ;
    }
}
