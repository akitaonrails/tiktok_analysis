package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.feed.model.survey.ForceVideo;
import com.ss.android.ugc.aweme.feed.model.survey.Option;
import com.ss.android.ugc.aweme.feed.model.survey.Question;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.10ww, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19411210ww {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZJ(Option option) {
        Question question;
        Question[] questionArr;
        Question question2;
        Option[] optionArr;
        Question[] questionArr2 = option.questions;
        if (questionArr2 == null || questionArr2.length == 0 || (question = (Question) C13LQ.LJIL(questionArr2)) == null || question.options == null || (questionArr = option.questions) == null || (question2 = (Question) C13LQ.LJIL(questionArr)) == null || (optionArr = question2.options) == null || optionArr.length == 0) {
            return false;
        }
        return true;
    }

    public static LinearLayoutManager LIZIZ(int i, final Context context) {
        if (i != 3 && i != 4) {
            return new LinearLayoutManager(context) { // from class: com.ss.android.ugc.aweme.feed.survey.utils.SurveyOptionUtils$getSingleChoiceLayoutManager$2
                @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
                public final boolean canScrollVertically() {
                    return false;
                }
            };
        }
        return new LinearLayoutManager(context) { // from class: com.ss.android.ugc.aweme.feed.survey.utils.SurveyOptionUtils$getSingleChoiceLayoutManager$1
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public final boolean canScrollHorizontally() {
                return false;
            }
        };
    }

    public static void LIZLLL(RecyclerView recyclerView, int i) {
        if (recyclerView == null) {
            return;
        }
        int itemDecorationCount = recyclerView.getItemDecorationCount();
        for (int i2 = 0; i2 < itemDecorationCount; i2++) {
            recyclerView.removeItemDecorationAt(0);
        }
        if (i != 2) {
            if (i != 3 && i != 4) {
                return;
            }
            recyclerView.addItemDecoration(new C19773212Xy(recyclerView, 3));
            return;
        }
        recyclerView.addItemDecoration(new C0DXR() { // from class: X.03Is
            public final int LL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));

            @Override // X.C0DXR
            public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView2, C21673919s1 c21673919s1) {
                int i3 = this.LL;
                rect.top = i3;
                rect.bottom = i3;
            }
        });
    }

    public static C19409710wh LIZ(final int i, final Context context, final ArrayList arrayList, final Function2 function2) {
        C19409710wh c19410210wm;
        if (i != 0) {
            if (i != 3 && i != 4) {
                c19410210wm = new C19409310wd(context, arrayList);
            } else {
                c19410210wm = new C19409710wh<Option>(context, i, arrayList) { // from class: X.10wr
                    public final Context LLILZIL;
                    public final ArrayList<Option> LLILZLL;
                    public final int LLIZ;

                    @Override // X.AbstractC21673619ry
                    public final int getItemCount() {
                        return this.LLILZLL.size();
                    }

                    @Override // X.AbstractC21673619ry
                    public final void onBindViewHolder(final RecyclerView.ViewHolder viewHolder, final int i2) {
                        String str;
                        ForceVideo forceVideo;
                        String[] strArr;
                        ForceVideo forceVideo2;
                        String[] strArr2;
                        if (!(viewHolder instanceof C19410910wt)) {
                            return;
                        }
                        C786410Ut5.I7(new AbstractViewOnClickListenerC420730Ged() { // from class: X.10ws
                            @Override // X.AbstractViewOnClickListenerC420730Ged
                            public final void LIZ(View view) {
                                InterfaceC19409010wa interfaceC19409010wa;
                                if (view != null && (interfaceC19409010wa = this.LLILZ.LLILZ) != null) {
                                    interfaceC19409010wa.LIZ(i2, viewHolder.itemView);
                                }
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(700L);
                            }
                        }, viewHolder.itemView);
                        int i3 = this.LLIZ;
                        if (i3 != 3) {
                            if (i3 == 4) {
                                SmartImageView smartImageView = (SmartImageView) ((C19410910wt) viewHolder).LL;
                                Option option = (Option) ListProtector.get(this.LLILZLL, i2);
                                Map<String, ForceVideo> map = option.images;
                                String str2 = null;
                                if (map != null && (forceVideo2 = map.get("selected_image")) != null && (strArr2 = forceVideo2.urlList) != null) {
                                    str = (String) C13LQ.LJIL(strArr2);
                                } else {
                                    str = null;
                                }
                                Map<String, ForceVideo> map2 = option.images;
                                if (map2 != null && (forceVideo = map2.get("unselected_image")) != null && (strArr = forceVideo.urlList) != null) {
                                    str2 = (String) C13LQ.LJIL(strArr);
                                }
                                if (!option.isSelected()) {
                                    String str3 = str2;
                                    str2 = str;
                                    str = str3;
                                }
                                if (str != null) {
                                    C1331670kl3 c1331670kl3LJI = C1331660kl2.LJI(UriProtector.parse(str));
                                    c1331670kl3LJI.LJJ(smartImageView);
                                    c1331670kl3LJI.LJIIJ(new C19746912Nv("emoji"));
                                }
                                if (str2 != null) {
                                    C1331660kl2.LJI(UriProtector.parse(str2)).LJIILIIL();
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        TuxIconView tuxIconView = (TuxIconView) ((C19410910wt) viewHolder).LL;
                        if (((Option) ListProtector.get(this.LLILZLL, i2)).isSelected()) {
                            tuxIconView.setTintColorRes(R.attr.ny);
                        } else {
                            tuxIconView.setTintColorRes(R.attr.eh);
                        }
                    }

                    @Override // X.AbstractC21673619ry
                    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
                        View view;
                        if (this.LLIZ == 4) {
                            SmartImageView smartImageView = new SmartImageView(viewGroup.getContext());
                            C786410Ut5.G6(smartImageView, new RecyclerView.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44))));
                            smartImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                            view = smartImageView;
                        } else {
                            TuxIconView tuxIconView = new TuxIconView(this.LLILZIL, null, 0, 6, null);
                            C419910GdJ c419910GdJ = new C419910GdJ();
                            c419910GdJ.LIZ = R.raw.icon_star_fill;
                            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44));
                            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44));
                            c419910GdJ.LJ = Integer.valueOf(R.attr.eh);
                            tuxIconView.setTuxIcon(c419910GdJ);
                            view = tuxIconView;
                        }
                        C19410910wt c19410910wt = new C19410910wt(view);
                        try {
                            View view2 = c19410910wt.itemView;
                            if (view2 != null) {
                                view2.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                        }
                        c19410910wt.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
                        try {
                            if (c19410910wt.itemView.getParent() != null) {
                                try {
                                    SettingsManager.LIZLLL().getClass();
                                } catch (Exception e) {
                                    TryCatchGuardChecker.doCheck(e);
                                }
                                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                                    stringBuffer.append(C19410910wt.class.getName());
                                    stringBuffer.append(" parent ");
                                    stringBuffer.append(viewGroup.getClass().getName());
                                    stringBuffer.append(" viewType ");
                                    stringBuffer.append(i2);
                                    C1AF0.LIZJ(stringBuffer.toString());
                                    ViewGroup viewGroup2 = (ViewGroup) c19410910wt.itemView.getParent();
                                    if (viewGroup2 != null) {
                                        C786410Ut5.LJJJLZIJ(c19410910wt.itemView, viewGroup2);
                                    }
                                }
                            }
                        } catch (Exception e2) {
                            TryCatchGuardChecker.doCheck(e2);
                            C2081408Dk.LIZ(e2);
                            C2344809Gs.LIZ(e2);
                        }
                        C20612085q.LIZ = C19410910wt.class.getName();
                        return c19410910wt;
                    }

                    {
                        super(context, arrayList);
                        this.LLILZIL = context;
                        this.LLILZLL = arrayList;
                        this.LLIZ = i;
                    }
                };
            }
        } else {
            c19410210wm = new C19410210wm(context, arrayList);
        }
        c19410210wm.LLILZ = new InterfaceC19409010wa() { // from class: X.10wv
            @Override // X.InterfaceC19409010wa
            public final void LIZ(int i2, View view) {
                Function2<View, Integer, Unit> function22 = function2;
                if (function22 != null) {
                    function22.invoke(view, Integer.valueOf(i2));
                }
            }
        };
        return c19410210wm;
    }
}
