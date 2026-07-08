package X;

import Y.ACListenerS53S0201000_29;
import android.content.Context;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.broadcast.model.AcademyCourseTheme;
import com.bytedance.android.live.broadcast.model.AcademySurveyQuestion;
import com.bytedance.android.live.broadcast.model.SurveyAnswer;
import com.bytedance.android.live.broadcast.model.SurveyQuestionOption;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.text.u;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.11vz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19660111vz implements InterfaceC19661111w9, InterfaceC690490R6p {
    public AcademyCourseTheme LL;
    public AcademySurveyQuestion LLILLJJLI;
    public Context LLILLL;
    public Aweme LLILZ;
    public View LLILZIL;
    public View LLILZLL;
    public View LLIZ;
    public View LLIZLLLIL;
    public TuxIconView LLJ;
    public TuxTextView LLJI;
    public RecyclerView LLJIJIL;
    public ViewStub LLJILJIL;
    public C19408810wY LLJILJILJ;
    public C19660211w0 LLJILLL;
    public String LLJJ;
    public String LLJJI;
    public String LLJJIII;
    public Long LLJJIJIIJIL;
    public String LLJJIJI = "";
    public String LLJJIJIL = "normal";
    public final ViewOnClickListenerC19660611w4 LLJJJ = new View.OnClickListener() { // from class: X.11w4
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int id = view.getId();
            if (id == R.id.jzi) {
                C505201xy c505201xy = C505201xy.LIZ;
                C19660111vz c19660111vz = this.LL;
                String str = c19660111vz.LLJJIJIL;
                String str2 = c19660111vz.LLJJIJI;
                Long l = c19660111vz.LLJJIJIIJIL;
                String str3 = c19660111vz.LLJJI;
                String str4 = c19660111vz.LLJJ;
                c505201xy.getClass();
                C505201xy.LIZ(l, str, str2, str3, str4, false);
                C19660411w2.LIZ.getClass();
                C19660411w2.LIZ();
                this.LL.LIZJ();
                return;
            }
            if (id != R.id.ex3) {
                return;
            }
            C505201xy c505201xy2 = C505201xy.LIZ;
            C19660111vz c19660111vz2 = this.LL;
            String str5 = c19660111vz2.LLJJIJIL;
            String str6 = c19660111vz2.LLJJIJI;
            Long l2 = c19660111vz2.LLJJIJIIJIL;
            String str7 = c19660111vz2.LLJJI;
            String str8 = c19660111vz2.LLJJ;
            c505201xy2.getClass();
            C505201xy.LIZ(l2, str5, str6, str7, str8, false);
            C19660411w2.LIZ.getClass();
            C19660411w2.LIZ();
            this.LL.LIZJ();
        }
    };

    @Override // X.InterfaceC690490R6p
    public final void LIZ() {
    }

    @Override // X.InterfaceC690490R6p
    public final void LIZLLL() {
    }

    @Override // X.InterfaceC690000R4s
    public final void LJ(Aweme aweme, boolean z) {
    }

    @Override // X.InterfaceC20289914aH
    public final void LJFF() {
    }

    @Override // X.InterfaceC690490R6p
    public final void LJIIIIZZ() {
    }

    @Override // X.InterfaceC20289914aH
    public final void LJIIIZ() {
    }

    @Override // X.InterfaceC690000R4s
    public final void LJIIJJI(EnumC20283814Yi enumC20283814Yi, Aweme aweme, boolean z) {
    }

    @Override // X.InterfaceC690000R4s
    public final void LJIILIIL() {
    }

    @Override // X.InterfaceC690490R6p
    public final void LJJLJLI() {
    }

    @Override // X.InterfaceC20289914aH
    public final boolean So() {
        return false;
    }

    @Override // X.InterfaceC690490R6p
    public final void g2() {
    }

    @Override // X.InterfaceC19661111w9
    public final void LIZIZ() {
        View view = this.LLIZLLLIL;
        if (view != null) {
            C19408810wY c19408810wY = this.LLJILJILJ;
            if (c19408810wY != null) {
                c19408810wY.LL = -1;
                c19408810wY.notifyDataSetChanged();
            }
            C786410Ut5.LJLLLLLL(0, view);
            View view2 = this.LLIZ;
            if (view2 != null) {
                C786410Ut5.I7(this.LLJJJ, view2);
            }
            this.LLJJIJIL = "go_back";
            C505201xy c505201xy = C505201xy.LIZ;
            String str = this.LLJJIJI;
            Long l = this.LLJJIJIIJIL;
            String str2 = this.LLJJI;
            String str3 = this.LLJJ;
            c505201xy.getClass();
            C505201xy.LIZ(l, "go_back", str, str2, str3, true);
        }
    }

    @Override // X.InterfaceC690490R6p
    public final void LIZJ() {
        View view = this.LLILZLL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        View view2 = this.LLILZIL;
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(0, view2);
        }
        View view3 = this.LLIZLLLIL;
        if (view3 != null) {
            C786410Ut5.LJLLLLLL(8, view3);
        }
        C19408810wY c19408810wY = this.LLJILJILJ;
        if (c19408810wY != null) {
            c19408810wY.LL = -1;
            c19408810wY.notifyDataSetChanged();
        }
        if (this.LLJILLL == null) {
            this.LLJILLL = new C19660211w0();
        }
        C19660211w0 c19660211w0 = this.LLJILLL;
        if (c19660211w0 != null) {
            c19660211w0.LIZ();
        }
    }

    @Override // X.InterfaceC690490R6p
    public final void LJI() {
        View view = this.LLILZIL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
    }

    @Override // X.InterfaceC19661111w9
    public final void LJII() {
        View view = this.LLILZLL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        View view2 = this.LLILZIL;
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(0, view2);
        }
        View view3 = this.LLIZLLLIL;
        if (view3 != null) {
            C786410Ut5.LJLLLLLL(8, view3);
        }
        C19408810wY c19408810wY = this.LLJILJILJ;
        if (c19408810wY != null) {
            c19408810wY.LL = -1;
            c19408810wY.notifyDataSetChanged();
        }
    }

    public final boolean LJIILL() {
        View view = this.LLILZLL;
        return view != null && view.getVisibility() == 4;
    }

    @Override // X.InterfaceC690490R6p
    public final boolean isShowing() {
        View view = this.LLILZLL;
        return view != null && view.getVisibility() == 0;
    }

    @Override // X.InterfaceC690490R6p
    public final void LJIIL(C1049060dPE c1049060dPE) {
        C1049070dPF.LIZ(this, c1049060dPE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [X.10wY, X.10wh, X.19ry] */
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
    public final void LJIILJJIL(ViewStub viewStub, final Context context, Aweme aweme, View view) {
        List<SurveyQuestionOption> list;
        View viewFindViewById;
        View viewFindViewById2;
        TuxIconView tuxIconView;
        TuxTextView tuxTextView;
        RecyclerView recyclerView;
        ViewStub viewStub2;
        LIZJ();
        if (context == null || aweme == null) {
            return;
        }
        C19660411w2.LIZ.getClass();
        AcademyCourseTheme academyCourseTheme = C19660411w2.LIZIZ;
        this.LL = academyCourseTheme;
        if (academyCourseTheme == null) {
            return;
        }
        Long lValueOf = null;
        AcademySurveyQuestion academySurveyQuestion = academyCourseTheme.videoSurvey;
        this.LLILLJJLI = academySurveyQuestion;
        if (academySurveyQuestion != null && (list = academySurveyQuestion.options) != null && list.size() >= 2) {
            this.LLILLL = context;
            this.LLILZ = aweme;
            this.LLILZIL = view;
            if (this.LLILZLL == null) {
                View viewLJLLLL = C786410Ut5.LJLLLL(viewStub);
                this.LLILZLL = viewLJLLLL;
                if (viewLJLLLL != null) {
                    viewFindViewById = viewLJLLLL.findViewById(R.id.ex3);
                } else {
                    viewFindViewById = null;
                }
                this.LLIZ = viewFindViewById;
                View view2 = this.LLILZLL;
                if (view2 != null) {
                    viewFindViewById2 = view2.findViewById(R.id.dgb);
                } else {
                    viewFindViewById2 = null;
                }
                this.LLIZLLLIL = viewFindViewById2;
                View view3 = this.LLILZLL;
                if (view3 != null) {
                    tuxIconView = (TuxIconView) view3.findViewById(R.id.jzi);
                } else {
                    tuxIconView = null;
                }
                this.LLJ = tuxIconView;
                View view4 = this.LLILZLL;
                if (view4 != null) {
                    tuxTextView = (TuxTextView) view4.findViewById(R.id.tv_title);
                } else {
                    tuxTextView = null;
                }
                this.LLJI = tuxTextView;
                View view5 = this.LLILZLL;
                if (view5 != null) {
                    recyclerView = (RecyclerView) view5.findViewById(R.id.ntx);
                } else {
                    recyclerView = null;
                }
                this.LLJIJIL = recyclerView;
                View view6 = this.LLILZLL;
                if (view6 != null) {
                    viewStub2 = (ViewStub) view6.findViewById(R.id.uia);
                } else {
                    viewStub2 = null;
                }
                this.LLJILJIL = viewStub2;
            }
            AcademySurveyQuestion academySurveyQuestion2 = this.LLILLJJLI;
            if (academySurveyQuestion2 != null) {
                this.LLJJ = C19660511w3.LIZ;
                this.LLJJI = C19660511w3.LIZIZ;
                this.LLJJIII = C19660511w3.LJI;
                this.LLJJIJI = C19660511w3.LJII;
                AcademyCourseTheme academyCourseTheme2 = this.LL;
                if (academyCourseTheme2 != null) {
                    lValueOf = Long.valueOf(academyCourseTheme2.seriesId);
                }
                this.LLJJIJIIJIL = lValueOf;
                TuxTextView tuxTextView2 = this.LLJI;
                if (tuxTextView2 != null) {
                    tuxTextView2.setText(academySurveyQuestion2.title);
                }
                RecyclerView recyclerView2 = this.LLJIJIL;
                if (recyclerView2 != 0) {
                    recyclerView2.setLayoutManager(new LinearLayoutManager(context) { // from class: com.ss.android.ugc.aweme.feed.survey.AcademyFeedSurveyViewHelper$bindView$1$linearLayoutManager$1
                        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
                        public final boolean canScrollVertically() {
                            return false;
                        }
                    });
                    List<SurveyQuestionOption> list2 = academySurveyQuestion2.options;
                    final ArrayList arrayList = new ArrayList(list2.size());
                    arrayList.addAll(list2);
                    ?? r1 = new C19409710wh<SurveyQuestionOption>(context, arrayList) { // from class: X.10wY
                        public final Context LLILZIL;
                        public final ArrayList<SurveyQuestionOption> LLILZLL;

                        @Override // X.AbstractC21673619ry
                        public final int getItemCount() {
                            return this.LLILZLL.size();
                        }

                        {
                            super(context, arrayList);
                            this.LLILZIL = context;
                            this.LLILZLL = arrayList;
                        }

                        @Override // X.AbstractC21673619ry
                        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                            boolean z;
                            if (!(viewHolder instanceof C19408910wZ)) {
                                return;
                            }
                            if (this.LLILLJJLI) {
                                C786410Ut5.I7(new ACListenerS53S0201000_29(this, i, viewHolder, 6), viewHolder.itemView);
                            }
                            C19408910wZ c19408910wZ = (C19408910wZ) viewHolder;
                            c19408910wZ.LL.setText(((SurveyQuestionOption) ListProtector.get(this.LLILZLL, i)).optionText);
                            TuxTextView tuxTextView3 = c19408910wZ.LL;
                            if (this.LL == i) {
                                z = true;
                            } else {
                                z = false;
                            }
                            tuxTextView3.setSelected(z);
                            if (c19408910wZ.LL.isSelected()) {
                                c19408910wZ.LL.setTextColorRes(R.attr.ee);
                            }
                        }

                        @Override // X.AbstractC21673619ry
                        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                            C19408910wZ c19408910wZ = new C19408910wZ(C786410Ut5.Td(C786410Ut5.ne(this.LLILZIL), R.layout.b4p, viewGroup, false));
                            try {
                                View view7 = c19408910wZ.itemView;
                                if (view7 != null) {
                                    view7.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
                                }
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                            }
                            c19408910wZ.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
                            try {
                                if (c19408910wZ.itemView.getParent() != null) {
                                    try {
                                        SettingsManager.LIZLLL().getClass();
                                    } catch (Exception e) {
                                        TryCatchGuardChecker.doCheck(e);
                                    }
                                    if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                                        StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                                        stringBuffer.append(C19408910wZ.class.getName());
                                        stringBuffer.append(" parent ");
                                        stringBuffer.append(viewGroup.getClass().getName());
                                        stringBuffer.append(" viewType ");
                                        stringBuffer.append(i);
                                        C1AF0.LIZJ(stringBuffer.toString());
                                        ViewGroup viewGroup2 = (ViewGroup) c19408910wZ.itemView.getParent();
                                        if (viewGroup2 != null) {
                                            C786410Ut5.LJJJLZIJ(c19408910wZ.itemView, viewGroup2);
                                        }
                                    }
                                }
                            } catch (Exception e2) {
                                TryCatchGuardChecker.doCheck(e2);
                                C2081408Dk.LIZ(e2);
                                C2344809Gs.LIZ(e2);
                            }
                            C20612085q.LIZ = C19408910wZ.class.getName();
                            return c19408910wZ;
                        }
                    };
                    this.LLJILJILJ = r1;
                    r1.LLILZ = new InterfaceC19409010wa() { // from class: X.11vy
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r1v20, types: [X.10wb, X.10wh, X.19ry] */
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
                        @Override // X.InterfaceC19409010wa
                        public final void LIZ(int i, View view7) {
                            int size;
                            SurveyQuestionOption surveyQuestionOption;
                            ViewStub viewStub3;
                            View view8;
                            String string;
                            Integer numLIZJ;
                            List<SurveyQuestionOption> list3;
                            View viewFindViewById3;
                            TuxIconView tuxIconView2;
                            TuxTextView tuxTextView3;
                            RecyclerView recyclerView3;
                            View viewFindViewById4;
                            TuxTextView tuxTextView4;
                            TuxIconView tuxIconView3;
                            C197039127h c197039127h;
                            TuxTextView tuxTextView5;
                            TuxTextView tuxTextView6;
                            Integer numValueOf;
                            int i2;
                            List<SurveyQuestionOption> list4;
                            List<SurveyQuestionOption> list5;
                            C19660111vz c19660111vz = this.LIZ;
                            C19408810wY c19408810wY = c19660111vz.LLJILJILJ;
                            if (c19408810wY != null) {
                                c19408810wY.LL = i;
                                c19408810wY.notifyDataSetChanged();
                            }
                            if (i >= 0) {
                                AcademySurveyQuestion academySurveyQuestion3 = c19660111vz.LLILLJJLI;
                                if (academySurveyQuestion3 != null && (list5 = academySurveyQuestion3.options) != null) {
                                    size = list5.size();
                                } else {
                                    size = 4;
                                }
                                if (i < size) {
                                    AcademySurveyQuestion academySurveyQuestion4 = c19660111vz.LLILLJJLI;
                                    String str = null;
                                    if (academySurveyQuestion4 != null && (list4 = academySurveyQuestion4.options) != null) {
                                        surveyQuestionOption = (SurveyQuestionOption) ListProtector.get(list4, i);
                                    } else {
                                        surveyQuestionOption = null;
                                    }
                                    AcademySurveyQuestion academySurveyQuestion5 = c19660111vz.LLILLJJLI;
                                    if (academySurveyQuestion5 != null) {
                                        C19660411w2 c19660411w2 = C19660411w2.LIZ;
                                        if (surveyQuestionOption != null) {
                                            numValueOf = Integer.valueOf(surveyQuestionOption.optionIndex);
                                        } else {
                                            numValueOf = null;
                                        }
                                        String strValueOf = String.valueOf(numValueOf);
                                        c19660411w2.getClass();
                                        C19660411w2.LIZLLL = strValueOf;
                                        String str2 = academySurveyQuestion5.questionId;
                                        int i3 = academySurveyQuestion5.questionType;
                                        Integer[] numArr = new Integer[2];
                                        if (surveyQuestionOption != null) {
                                            i2 = surveyQuestionOption.optionIndex;
                                        } else {
                                            i2 = -1;
                                        }
                                        numArr[0] = Integer.valueOf(i2);
                                        numArr[1] = -1;
                                        C19660411w2.LIZJ = new SurveyAnswer(str2, i3, C1697810uHb.LJIILJJIL(numArr));
                                    }
                                    if (surveyQuestionOption != null && (viewStub3 = c19660111vz.LLJILJIL) != null && (view8 = c19660111vz.LLIZLLLIL) != null) {
                                        C786410Ut5.LJLLLLLL(4, view8);
                                        if (c19660111vz.LLJILLL == null) {
                                            c19660111vz.LLJILLL = new C19660211w0();
                                        }
                                        final C19660211w0 c19660211w0 = c19660111vz.LLJILLL;
                                        if (c19660211w0 != null) {
                                            final Context context2 = c19660111vz.LLILLL;
                                            Aweme aweme2 = c19660111vz.LLILZ;
                                            String strValueOf2 = String.valueOf(surveyQuestionOption.optionIndex);
                                            View view9 = c19660111vz.LLIZ;
                                            String str3 = c19660111vz.LLJJ;
                                            String str4 = c19660111vz.LLJJIII;
                                            Long l = c19660111vz.LLJJIJIIJIL;
                                            String str5 = c19660111vz.LLJJI;
                                            c19660211w0.LIZ();
                                            if (context2 != null && aweme2 != null) {
                                                c19660211w0.LLILZLL = context2;
                                                c19660211w0.LLJJIJIL = c19660111vz;
                                                c19660211w0.LL = surveyQuestionOption;
                                                c19660211w0.LLIZLLLIL = view9;
                                                c19660211w0.LLILLJJLI = str3;
                                                c19660211w0.LLILLL = str5;
                                                c19660211w0.LLILZ = str4;
                                                c19660211w0.LLILZIL = l;
                                                C19660411w2.LIZ.getClass();
                                                C19660411w2.LJ = strValueOf2;
                                                if (c19660211w0.LLIZ == null) {
                                                    View viewLJLLLL2 = C786410Ut5.LJLLLL(viewStub3);
                                                    c19660211w0.LLIZ = viewLJLLLL2;
                                                    if (viewLJLLLL2 != null) {
                                                        C786410Ut5.LJLLLLLL(8, viewLJLLLL2);
                                                    }
                                                    View view10 = c19660211w0.LLIZ;
                                                    if (view10 != null) {
                                                        viewFindViewById3 = view10.findViewById(R.id.dgb);
                                                    } else {
                                                        viewFindViewById3 = null;
                                                    }
                                                    c19660211w0.LLJ = viewFindViewById3;
                                                    View view11 = c19660211w0.LLIZ;
                                                    if (view11 != null) {
                                                        tuxIconView2 = (TuxIconView) view11.findViewById(R.id.jzi);
                                                    } else {
                                                        tuxIconView2 = null;
                                                    }
                                                    c19660211w0.LLJI = tuxIconView2;
                                                    View view12 = c19660211w0.LLIZ;
                                                    if (view12 != null) {
                                                        tuxTextView3 = (TuxTextView) view12.findViewById(R.id.tv_title);
                                                    } else {
                                                        tuxTextView3 = null;
                                                    }
                                                    c19660211w0.LLJIJIL = tuxTextView3;
                                                    View view13 = c19660211w0.LLIZ;
                                                    if (view13 != null) {
                                                        recyclerView3 = (RecyclerView) view13.findViewById(R.id.ntx);
                                                    } else {
                                                        recyclerView3 = null;
                                                    }
                                                    c19660211w0.LLJILJIL = recyclerView3;
                                                    View view14 = c19660211w0.LLIZ;
                                                    if (view14 != null) {
                                                        viewFindViewById4 = view14.findViewById(R.id.krx);
                                                    } else {
                                                        viewFindViewById4 = null;
                                                    }
                                                    c19660211w0.LLJILJILJ = viewFindViewById4;
                                                    View view15 = c19660211w0.LLIZ;
                                                    if (view15 != null) {
                                                        tuxTextView4 = (TuxTextView) view15.findViewById(R.id.ksm);
                                                    } else {
                                                        tuxTextView4 = null;
                                                    }
                                                    c19660211w0.LLJILLL = tuxTextView4;
                                                    View view16 = c19660211w0.LLIZ;
                                                    if (view16 != null) {
                                                        tuxIconView3 = (TuxIconView) view16.findViewById(R.id.e0h);
                                                    } else {
                                                        tuxIconView3 = null;
                                                    }
                                                    c19660211w0.LLJJ = tuxIconView3;
                                                    View view17 = c19660211w0.LLIZ;
                                                    if (view17 != null) {
                                                        c197039127h = (C197039127h) view17.findViewById(R.id.cvd);
                                                    } else {
                                                        c197039127h = null;
                                                    }
                                                    c19660211w0.LLJJIII = c197039127h;
                                                    View view18 = c19660211w0.LLIZ;
                                                    if (view18 != null) {
                                                        tuxTextView5 = (TuxTextView) view18.findViewById(R.id.j2n);
                                                    } else {
                                                        tuxTextView5 = null;
                                                    }
                                                    c19660211w0.LLJJIJI = tuxTextView5;
                                                    View view19 = c19660211w0.LLIZ;
                                                    if (view19 != null) {
                                                        tuxTextView6 = (TuxTextView) view19.findViewById(R.id.rul);
                                                    } else {
                                                        tuxTextView6 = null;
                                                    }
                                                    c19660211w0.LLJJIJIIJIL = tuxTextView6;
                                                }
                                                View view20 = c19660211w0.LLJ;
                                                if (view20 != null) {
                                                    C786410Ut5.I7(c19660211w0.LLJJJIL, view20);
                                                }
                                                TuxIconView tuxIconView4 = c19660211w0.LLJI;
                                                if (tuxIconView4 != null) {
                                                    C786410Ut5.a9(tuxIconView4, c19660211w0.LLJJJIL);
                                                }
                                                View view21 = c19660211w0.LLIZLLLIL;
                                                if (view21 != null) {
                                                    C786410Ut5.I7(c19660211w0.LLJJJIL, view21);
                                                }
                                                TuxTextView tuxTextView7 = c19660211w0.LLJIJIL;
                                                if (tuxTextView7 != null) {
                                                    SurveyQuestionOption surveyQuestionOption2 = c19660211w0.LL;
                                                    if (surveyQuestionOption2 != null) {
                                                        str = surveyQuestionOption2.helpText;
                                                    }
                                                    tuxTextView7.setText(str);
                                                }
                                                View view22 = c19660211w0.LLJILJILJ;
                                                if (view22 != null) {
                                                    C786410Ut5.I7(c19660211w0.LLJJJIL, view22);
                                                }
                                                TuxTextView tuxTextView8 = c19660211w0.LLJILLL;
                                                if (tuxTextView8 != null) {
                                                    tuxTextView8.addTextChangedListener(new C19773412Ya(c19660211w0, 26));
                                                }
                                                TuxIconView tuxIconView5 = c19660211w0.LLJJ;
                                                if (tuxIconView5 != null) {
                                                    C786410Ut5.a9(tuxIconView5, c19660211w0.LLJJJIL);
                                                }
                                                C197039127h c197039127h2 = c19660211w0.LLJJIII;
                                                if (c197039127h2 != null) {
                                                    c197039127h2.setText(context2.getString(2131843197));
                                                    C786410Ut5.U8(c197039127h2, c19660211w0.LLJJJIL);
                                                }
                                                TuxTextView tuxTextView9 = c19660211w0.LLJJIJI;
                                                if (tuxTextView9 != null) {
                                                    tuxTextView9.setText(2131836150);
                                                    C786410Ut5.h9(tuxTextView9, c19660211w0.LLJJJIL);
                                                }
                                                RecyclerView recyclerView4 = c19660211w0.LLJILJIL;
                                                if (recyclerView4 != 0) {
                                                    recyclerView4.setLayoutManager(new LinearLayoutManager(context2) { // from class: com.ss.android.ugc.aweme.feed.survey.AcademySecondarySurveyViewHelper$bindOptionView$1$linearLayoutManager$1
                                                        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
                                                        public final boolean canScrollVertically() {
                                                            return false;
                                                        }
                                                    });
                                                    SurveyQuestionOption surveyQuestionOption3 = c19660211w0.LL;
                                                    if (surveyQuestionOption3 != null && (list3 = surveyQuestionOption3.subOptions) != null) {
                                                        final ArrayList arrayList2 = new ArrayList(list3.size());
                                                        arrayList2.addAll(list3);
                                                        final ?? r12 = new C19409710wh<SurveyQuestionOption>(context2, arrayList2) { // from class: X.10wb
                                                            public final Context LLILZIL;
                                                            public final ArrayList<SurveyQuestionOption> LLILZLL;

                                                            @Override // X.AbstractC21673619ry
                                                            public final int getItemCount() {
                                                                return this.LLILZLL.size();
                                                            }

                                                            {
                                                                super(context2, arrayList2);
                                                                this.LLILZIL = context2;
                                                                this.LLILZLL = arrayList2;
                                                            }

                                                            @Override // X.AbstractC21673619ry
                                                            public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i4) {
                                                                boolean z;
                                                                if (!(viewHolder instanceof C19409210wc)) {
                                                                    return;
                                                                }
                                                                if (this.LLILLJJLI) {
                                                                    C786410Ut5.I7(new ACListenerS53S0201000_29(this, i4, viewHolder, 7), viewHolder.itemView);
                                                                }
                                                                C19409210wc c19409210wc = (C19409210wc) viewHolder;
                                                                c19409210wc.LL.setText(((SurveyQuestionOption) ListProtector.get(this.LLILZLL, i4)).optionText);
                                                                TuxTextView tuxTextView10 = c19409210wc.LL;
                                                                if (this.LL == i4) {
                                                                    z = true;
                                                                } else {
                                                                    z = false;
                                                                }
                                                                tuxTextView10.setSelected(z);
                                                                if (c19409210wc.LL.isSelected()) {
                                                                    c19409210wc.LL.setTextColorRes(R.attr.ee);
                                                                } else {
                                                                    c19409210wc.LL.setTextColorRes(R.attr.eg);
                                                                }
                                                            }

                                                            @Override // X.AbstractC21673619ry
                                                            public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i4) {
                                                                C19409210wc c19409210wc = new C19409210wc(C786410Ut5.Td(C786410Ut5.ne(this.LLILZIL), R.layout.b4o, viewGroup, false));
                                                                try {
                                                                    View view23 = c19409210wc.itemView;
                                                                    if (view23 != null) {
                                                                        view23.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
                                                                    }
                                                                } catch (Throwable th) {
                                                                    TryCatchGuardChecker.doCheck(th);
                                                                }
                                                                c19409210wc.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
                                                                try {
                                                                    if (c19409210wc.itemView.getParent() != null) {
                                                                        try {
                                                                            SettingsManager.LIZLLL().getClass();
                                                                        } catch (Exception e) {
                                                                            TryCatchGuardChecker.doCheck(e);
                                                                        }
                                                                        if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                                                                            StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                                                                            stringBuffer.append(C19409210wc.class.getName());
                                                                            stringBuffer.append(" parent ");
                                                                            stringBuffer.append(viewGroup.getClass().getName());
                                                                            stringBuffer.append(" viewType ");
                                                                            stringBuffer.append(i4);
                                                                            C1AF0.LIZJ(stringBuffer.toString());
                                                                            ViewGroup viewGroup2 = (ViewGroup) c19409210wc.itemView.getParent();
                                                                            if (viewGroup2 != null) {
                                                                                C786410Ut5.LJJJLZIJ(c19409210wc.itemView, viewGroup2);
                                                                            }
                                                                        }
                                                                    }
                                                                } catch (Exception e2) {
                                                                    TryCatchGuardChecker.doCheck(e2);
                                                                    C2081408Dk.LIZ(e2);
                                                                    C2344809Gs.LIZ(e2);
                                                                }
                                                                C20612085q.LIZ = C19409210wc.class.getName();
                                                                return c19409210wc;
                                                            }
                                                        };
                                                        c19660211w0.LLJJJ = r12;
                                                        r12.LLILZ = new InterfaceC19409010wa() { // from class: X.11vx
                                                            @Override // X.InterfaceC19409010wa
                                                            public final void LIZ(int i4, View view23) {
                                                                boolean z;
                                                                View view24;
                                                                View view25;
                                                                List<Integer> list6;
                                                                C19409110wb c19409110wb = c19660211w0.LLJJJ;
                                                                if (c19409110wb != null) {
                                                                    c19409110wb.LL = i4;
                                                                }
                                                                notifyDataSetChanged();
                                                                C197039127h c197039127h3 = c19660211w0.LLJJIII;
                                                                if (c197039127h3 != null) {
                                                                    c197039127h3.setEnabled(true);
                                                                    c197039127h3.setClickable(true);
                                                                    c197039127h3.setButtonVariant(0);
                                                                }
                                                                SurveyQuestionOption surveyQuestionOption4 = (SurveyQuestionOption) ListProtector.get(arrayList2, i4);
                                                                C19660411w2.LIZ.getClass();
                                                                SurveyAnswer surveyAnswer = C19660411w2.LIZJ;
                                                                if (surveyAnswer != null && (list6 = surveyAnswer.optionIndexes) != null) {
                                                                    ListProtector.set(list6, 1, Integer.valueOf(surveyQuestionOption4.optionIndex));
                                                                }
                                                                C19660411w2.LJFF = i4;
                                                                C19660211w0 c19660211w02 = c19660211w0;
                                                                c19660211w02.getClass();
                                                                int i5 = surveyQuestionOption4.type;
                                                                EnumC1984807q2 enumC1984807q2 = EnumC1984807q2.TEXT;
                                                                if (i5 == enumC1984807q2.getType()) {
                                                                    z = true;
                                                                } else {
                                                                    z = false;
                                                                }
                                                                if (!z ? (view24 = c19660211w02.LLJILJILJ) == null || view24.getVisibility() != 8 : (view25 = c19660211w02.LLJILJILJ) == null || view25.getVisibility() != 0) {
                                                                    View view26 = c19660211w02.LLJILJILJ;
                                                                    if (view26 != null) {
                                                                        if (z) {
                                                                            C786410Ut5.LJLLLLLL(0, view26);
                                                                        } else {
                                                                            C786410Ut5.LJLLLLLL(8, view26);
                                                                        }
                                                                    }
                                                                }
                                                                C19660211w0 c19660211w03 = c19660211w0;
                                                                c19660211w03.getClass();
                                                                if (surveyQuestionOption4.type == enumC1984807q2.getType()) {
                                                                    TuxTextView tuxTextView10 = c19660211w03.LLJILLL;
                                                                    if (tuxTextView10 != null) {
                                                                        tuxTextView10.setText(c19660211w03.LLJJI);
                                                                    }
                                                                    if (c19660211w03.LLJJI.length() > 0) {
                                                                        TuxIconView tuxIconView6 = c19660211w03.LLJJ;
                                                                        if (tuxIconView6 != null) {
                                                                            C786410Ut5.LLLLLLZZ(tuxIconView6, 0);
                                                                            return;
                                                                        }
                                                                        return;
                                                                    }
                                                                    TuxIconView tuxIconView7 = c19660211w03.LLJJ;
                                                                    if (tuxIconView7 == null) {
                                                                        return;
                                                                    }
                                                                    C786410Ut5.LLLLLLZZ(tuxIconView7, 8);
                                                                }
                                                            }
                                                        };
                                                        recyclerView4.setAdapter(r12);
                                                    }
                                                }
                                                View view23 = c19660211w0.LLIZ;
                                                if (view23 != null) {
                                                    C786410Ut5.LJLLLLLL(0, view23);
                                                }
                                                View view24 = c19660211w0.LLIZLLLIL;
                                                if (view24 != null) {
                                                    C786410Ut5.LJLLLLLL(0, view24);
                                                }
                                                View view25 = c19660211w0.LLJ;
                                                if (view25 != null) {
                                                    C786410Ut5.LJLLLLLL(0, view25);
                                                }
                                                TuxIconView tuxIconView6 = c19660211w0.LLJI;
                                                if (tuxIconView6 != null) {
                                                    C786410Ut5.LLLLLLZZ(tuxIconView6, 0);
                                                }
                                                TuxTextView tuxTextView10 = c19660211w0.LLJIJIL;
                                                if (tuxTextView10 != null) {
                                                    C786410Ut5.LLLLZLL(tuxTextView10, 0);
                                                }
                                                RecyclerView recyclerView5 = c19660211w0.LLJILJIL;
                                                if (recyclerView5 != null) {
                                                    C786410Ut5.LLIZLLLIL(recyclerView5, 0);
                                                }
                                                View view26 = c19660211w0.LLJILJILJ;
                                                if (view26 != null) {
                                                    C786410Ut5.LJLLLLLL(8, view26);
                                                }
                                                C197039127h c197039127h3 = c19660211w0.LLJJIII;
                                                if (c197039127h3 != null) {
                                                    C786410Ut5.LLLLLLJ(c197039127h3, 0);
                                                }
                                                TuxTextView tuxTextView11 = c19660211w0.LLJJIJI;
                                                if (tuxTextView11 != null) {
                                                    C786410Ut5.LLLLZLL(tuxTextView11, 0);
                                                }
                                                TuxTextView tuxTextView12 = c19660211w0.LLJJIJIIJIL;
                                                if (tuxTextView12 != null) {
                                                    C786410Ut5.LLLLZLL(tuxTextView12, 0);
                                                }
                                                Context context3 = c19660211w0.LLILZLL;
                                                if (context3 != null && (string = context3.getString(2131843191)) != null) {
                                                    int length = string.length();
                                                    int i4 = 0;
                                                    while (true) {
                                                        if (i4 < length) {
                                                            if (string.charAt(i4) == '[') {
                                                                break;
                                                            } else {
                                                                i4++;
                                                            }
                                                        } else {
                                                            i4 = -1;
                                                            break;
                                                        }
                                                    }
                                                    int i5 = i4 - 1;
                                                    int length2 = string.length();
                                                    int i6 = 0;
                                                    while (true) {
                                                        if (i6 < length2) {
                                                            if (string.charAt(i6) == ']') {
                                                                break;
                                                            } else {
                                                                i6++;
                                                            }
                                                        } else {
                                                            i6 = -1;
                                                            break;
                                                        }
                                                    }
                                                    int i7 = i6 - 1;
                                                    SpannableString spannableString = new SpannableString(u.LJJIFFI(u.LJJIFFI(string, e3.e, "", false), e3.f, "", false));
                                                    if (i5 >= 0 && i7 >= 0) {
                                                        if (i5 > i7) {
                                                            i7 = i5;
                                                            i5 = i7;
                                                        }
                                                        C786410Ut5.p2(spannableString, new C444920HcY(72, false), i5, i7, 34);
                                                        C786410Ut5.p2(spannableString, new C785810Us7(c19660211w0, 8), i5, i7, 34);
                                                        Context context4 = c19660211w0.LLILZLL;
                                                        if (context4 != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.eg, context4)) != null) {
                                                            C786410Ut5.p2(spannableString, new ForegroundColorSpan(numLIZJ.intValue()), i5, i7, 34);
                                                        }
                                                    }
                                                    TuxTextView tuxTextView13 = c19660211w0.LLJJIJIIJIL;
                                                    if (tuxTextView13 != null) {
                                                        tuxTextView13.setMovementMethod(LinkMovementMethod.getInstance());
                                                    }
                                                    TuxTextView tuxTextView14 = c19660211w0.LLJJIJIIJIL;
                                                    if (tuxTextView14 != null) {
                                                        tuxTextView14.setText(spannableString);
                                                    }
                                                }
                                                C505201xy.LIZ.getClass();
                                                C505201xy.LIZJ(true, false, false, "", strValueOf2, "", "", "", l, str5, str3);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    };
                    recyclerView2.setAdapter(r1);
                }
                TuxIconView tuxIconView2 = this.LLJ;
                if (tuxIconView2 != null) {
                    C786410Ut5.a9(tuxIconView2, this.LLJJJ);
                }
                View view7 = this.LLIZLLLIL;
                if (view7 != null) {
                    C786410Ut5.I7(this.LLJJJ, view7);
                }
                View view8 = this.LLIZ;
                if (view8 != null) {
                    C786410Ut5.I7(this.LLJJJ, view8);
                }
                View view9 = this.LLILZLL;
                if (view9 != null) {
                    C786410Ut5.LJLLLLLL(4, view9);
                }
                View view10 = this.LLIZ;
                if (view10 != null) {
                    C786410Ut5.LJLLLLLL(4, view10);
                }
                View view11 = this.LLIZLLLIL;
                if (view11 != null) {
                    C786410Ut5.LJLLLLLL(4, view11);
                }
                TuxIconView tuxIconView3 = this.LLJ;
                if (tuxIconView3 != null) {
                    C786410Ut5.LLLLLLZZ(tuxIconView3, 4);
                }
                TuxTextView tuxTextView3 = this.LLJI;
                if (tuxTextView3 != null) {
                    C786410Ut5.LLLLZLL(tuxTextView3, 4);
                }
                RecyclerView recyclerView3 = this.LLJIJIL;
                if (recyclerView3 != null) {
                    C786410Ut5.LLIZLLLIL(recyclerView3, 4);
                }
            }
        }
    }

    @Override // X.InterfaceC690490R6p
    public final void LJIIJ(ViewStub viewStub, Context context, Aweme aweme, View view, View view2, View view3, View view4, boolean z, AbstractC19368810q6 abstractC19368810q6) {
        AcademySurveyQuestion academySurveyQuestion;
        LIZJ();
        if (context == null || aweme == null) {
            return;
        }
        if (this.LL == null) {
            C19660411w2.LIZ.getClass();
            this.LL = C19660411w2.LIZIZ;
        }
        if (this.LL == null) {
            return;
        }
        if (this.LLILLJJLI == null) {
            C19660411w2.LIZ.getClass();
            AcademyCourseTheme academyCourseTheme = C19660411w2.LIZIZ;
            if (academyCourseTheme != null) {
                academySurveyQuestion = academyCourseTheme.videoSurvey;
            } else {
                academySurveyQuestion = null;
            }
            this.LLILLJJLI = academySurveyQuestion;
        }
        if (this.LLILLJJLI == null) {
            return;
        }
        this.LLILLL = context;
        this.LLILZ = aweme;
        this.LLILZIL = view;
        this.LLJJIJIL = "normal";
        synchronized (this) {
            View view5 = this.LLILZLL;
            if (view5 != null && view5.getVisibility() == 0) {
                return;
            }
            View view6 = this.LLILZLL;
            if (view6 != null) {
                C786410Ut5.LJLLLLLL(0, view6);
            }
            View view7 = this.LLIZ;
            if (view7 != null) {
                C786410Ut5.LJLLLLLL(0, view7);
            }
            View view8 = this.LLIZLLLIL;
            if (view8 != null) {
                C786410Ut5.LJLLLLLL(0, view8);
            }
            TuxIconView tuxIconView = this.LLJ;
            if (tuxIconView != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView, 0);
            }
            TuxTextView tuxTextView = this.LLJI;
            if (tuxTextView != null) {
                C786410Ut5.LLLLZLL(tuxTextView, 0);
            }
            RecyclerView recyclerView = this.LLJIJIL;
            if (recyclerView != null) {
                C786410Ut5.LLIZLLLIL(recyclerView, 0);
            }
            C505201xy c505201xy = C505201xy.LIZ;
            String str = this.LLJJIJIL;
            String str2 = this.LLJJIJI;
            Long l = this.LLJJIJIIJIL;
            String str3 = this.LLJJI;
            String str4 = this.LLJJ;
            c505201xy.getClass();
            C505201xy.LIZ(l, str, str2, str3, str4, true);
        }
    }
}
