package X;

import android.graphics.drawable.Animatable;
import android.view.View;
import android.widget.PopupWindow;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.livesdk.performance.emote.EmotePerformanceTrackerViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.text.a0;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0Jxh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C508990Jxh extends AbstractC434960H3u {
    public final C19R6 LL;
    public final /* synthetic */ C435230H4v LLILLJJLI;

    @Override // X.AbstractC434960H3u
    public final void I5(int i) {
        Object obj;
        List<String> listLIZ;
        final EmoteModel emoteModel = (EmoteModel) C13LP.LJJJLZIJ(i, this.LLILLJJLI.LLILZLL);
        final C19R6 c19r6 = this.LL;
        if (c19r6 != null && emoteModel != null) {
            EmotePerformanceTrackerViewModel emotePerformanceTrackerViewModel = (EmotePerformanceTrackerViewModel) this.LLILLJJLI.LLIZLLLIL.getValue();
            if (emotePerformanceTrackerViewModel != null) {
                emotePerformanceTrackerViewModel.vQ2(emoteModel);
            }
            final C118300cf c118300cf = new C118300cf();
            if (!C842240X2g.LIZ(emoteModel.image).isEmpty()) {
                ImageModel imageModel = emoteModel.image;
                if (imageModel != null && (listLIZ = C842240X2g.LIZ(imageModel)) != null) {
                    obj = ListProtector.get(listLIZ, 0);
                } else {
                    obj = null;
                }
                if (C1819620xS4.LIZJ(String.valueOf(obj))) {
                    c118300cf.element = 1;
                }
            }
            C1324610kZf c1324610kZfLJIIIZ = C1819620xS4.LIZ().LJIIIZ(emoteModel.image);
            c1324610kZfLJIIIZ.LJJ = Boolean.TRUE;
            c1324610kZfLJIIIZ.LJIIL = new InterfaceC1142670fqD() { // from class: X.0Jxi
                @Override // X.InterfaceC1142670fqD
                public final void LIZ() {
                }

                @Override // X.InterfaceC1142670fqD
                public final void LIZIZ(Animatable animatable) {
                }

                @Override // X.InterfaceC1142670fqD
                public final void LIZLLL(String str, Exception exc) {
                    String message;
                    C508990Jxh c508990Jxh = this.LIZ;
                    EmoteModel emoteModel2 = emoteModel;
                    if (exc == null || (message = exc.getMessage()) == null) {
                        message = "";
                    }
                    c508990Jxh.L5(emoteModel2, message, 0);
                }

                @Override // X.InterfaceC1142670fqD
                public final void LIZJ(int i2, int i3, String str) {
                    this.LIZ.L5(emoteModel, "", c118300cf.element);
                }
            };
            c1324610kZfLJIIIZ.LJJI(c19r6);
            final C435230H4v c435230H4v = this.LLILLJJLI;
            C786410Ut5.e8(c19r6, new View.OnClickListener() { // from class: X.0Jxf
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C435230H4v c435230H4v2 = c435230H4v;
                    C1324720kZq c1324720kZq = c19r6;
                    EmoteModel emoteModel2 = emoteModel;
                    if (emoteModel2 == null) {
                        c435230H4v2.getClass();
                        return;
                    }
                    PopupWindow popupWindow = c435230H4v2.LLIZ;
                    if (popupWindow != null) {
                        popupWindow.dismiss();
                    }
                    View viewTd = C786410Ut5.Td(C786410Ut5.ne(c435230H4v2.LL), R.layout.hiv, null, false);
                    PopupWindow popupWindow2 = new PopupWindow(viewTd, -2, -2);
                    popupWindow2.setOutsideTouchable(true);
                    C1819620xS4.LIZ().LJIIIZ(emoteModel2.image).LJJI(viewTd.findViewById(R.id.h6r));
                    int iLIZIZ = (int) C497740JfY.LIZIZ(84.0f);
                    int measuredWidth = c1324720kZq.getMeasuredWidth();
                    C786410Ut5.j3(popupWindow2, c1324720kZq, (measuredWidth - iLIZIZ) / 2, ((-measuredWidth) - iLIZIZ) - ((int) C497740JfY.LIZIZ(c435230H4v2.LLJ.LLILLL)), 3);
                    c435230H4v2.LLIZ = popupWindow2;
                    c435230H4v2.LLILZ.hS(C507380Jv6.LIZ(1).LIZ, C2097608Jq.LJ());
                }
            });
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C508990Jxh(C435230H4v c435230H4v, View view) {
        super(view);
        this.LLILLJJLI = c435230H4v;
        this.LL = (C19R6) view.findViewById(R.id.h1i);
    }

    public final void L5(EmoteModel emoteModel, String str, int i) {
        List<EmoteModel> list;
        String strLJJLJLI;
        boolean z;
        int i2;
        ImageModel imageModel;
        List urls;
        String str2;
        EmotePerformanceTrackerViewModel emotePerformanceTrackerViewModel = (EmotePerformanceTrackerViewModel) this.LLILLJJLI.LLIZLLLIL.getValue();
        if (emotePerformanceTrackerViewModel != null && (!((ArrayList) emotePerformanceTrackerViewModel.LLJ).isEmpty()) && emotePerformanceTrackerViewModel != null) {
            String str3 = "";
            if (emoteModel == null || (imageModel = emoteModel.image) == null || (urls = imageModel.getUrls()) == null || (str2 = (String) C13LP.LJJJLZIJ(0, urls)) == null || (strLJJLJLI = a0.LJJLJLI(str2, e3.d, str2)) == null) {
                strLJJLJLI = "";
            }
            if (i == 2) {
                z = true;
            } else {
                z = false;
            }
            if (emotePerformanceTrackerViewModel.wQ2(emoteModel, z)) {
                String str4 = emoteModel.emoteId;
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (str.length() == 0) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                int i3 = i2 ^ 1;
                if (str.length() != 0) {
                    str3 = str;
                }
                emotePerformanceTrackerViewModel.yQ2(i, str4, jCurrentTimeMillis, i3, str3, strLJJLJLI);
            }
        }
        EmotePerformanceTrackerViewModel emotePerformanceTrackerViewModel2 = (EmotePerformanceTrackerViewModel) this.LLILLJJLI.LLIZLLLIL.getValue();
        if (emotePerformanceTrackerViewModel2 != null && (list = emotePerformanceTrackerViewModel2.LLJ) != null && ((ArrayList) list).isEmpty()) {
            EmotePerformanceTrackerViewModel emotePerformanceTrackerViewModel3 = (EmotePerformanceTrackerViewModel) this.LLILLJJLI.LLIZLLLIL.getValue();
            if (emotePerformanceTrackerViewModel3 != null) {
                emotePerformanceTrackerViewModel3.LLILLL = System.currentTimeMillis();
            }
            EmotePerformanceTrackerViewModel emotePerformanceTrackerViewModel4 = (EmotePerformanceTrackerViewModel) this.LLILLJJLI.LLIZLLLIL.getValue();
            if (emotePerformanceTrackerViewModel4 != null) {
                emotePerformanceTrackerViewModel4.xQ2();
            }
        }
    }
}
