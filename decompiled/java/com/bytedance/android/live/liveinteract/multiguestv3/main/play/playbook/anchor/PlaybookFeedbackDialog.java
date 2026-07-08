package com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor;

import X.AbstractC21342018fa;
import X.AbstractC960460b6K;
import X.C01GW;
import X.C0DXR;
import X.C0WZX;
import X.C1117360fBO;
import X.C13LP;
import X.C16FS;
import X.C20410214tg;
import X.C20410314th;
import X.C20410414ti;
import X.C20410814tm;
import X.C20441214yg;
import X.C20736316Cj;
import X.C21341918fZ;
import X.C21342318fd;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C410901il;
import X.C452501pT;
import X.C500260Jjc;
import X.C786410Ut5;
import X.C915190ZvJ;
import X.C949720ap0;
import X.C978360bZC;
import X.InterfaceC20410614tk;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAnchorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookFeedbackDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookSheetFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.IPlaybookApi;
import com.bytedance.android.live.liveinteract.multilive.model.UserFeedbackParams;
import com.bytedance.android.live.liveinteract.multilive.model.UserFeedbackResponse;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public final class PlaybookFeedbackDialog extends BasePlaybookSheetFragment implements InterfaceC20410614tk {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyImJDElLjo2OzE6HELIOSemE+KSwiZz8/KTxiOSMyMScjJiR9KSsvISAhZhUgKDYxJyonDyo2LCctKiQXISQgJig=";
    public final List<C949720ap0> LLJZIJLIL;
    public final PlaybookAnchorViewModel LLL;
    public View LLLF;
    public RecyclerView LLLFF;
    public EditText LLLFFI;
    public TextView LLLFZ;
    public View LLLI;
    public C16FS LLLII;
    public final C1117360fBO LLLIIII;
    public C949720ap0 LLLIIIIL;
    public final String LLLIIIL;
    public final C01GW LLLIIL;

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookSheetFragment
    public final int getLayoutId() {
        return R.layout.h9o;
    }

    public final void ES() {
        Editable editableLLJILLL;
        EditText editText = this.LLLFFI;
        boolean z = false;
        int length = (editText == null || (editableLLJILLL = C2204961BRm.LLJILLL(editText, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yeeYEJJ97iNZknTVMu//6lsVPlMF/xh3yMjXB9EX+N5cT+2VtFZpmdg6UUTXIC64GxEhOUcCM/MYEStRVPIPHo9XaOFpkpT4ZplCMR0=", null))) == null) ? 0 : editableLLJILLL.length();
        C16FS c16fs = this.LLLII;
        if (c16fs != null) {
            if (this.LLLIIIIL != null && 1 <= length && length < 201) {
                z = true;
            }
            c16fs.setEnabled(z);
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        EditText editText = this.LLLFFI;
        if (editText != null) {
            editText.removeTextChangedListener((C20410214tg) this.LLLIIL.getValue());
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookSheetFragment
    public final String yS() {
        return this.LLLIIIL;
    }

    public final void BS(C20410414ti c20410414ti) {
        C949720ap0 c949720ap0;
        C949720ap0 c949720ap02;
        if (c20410414ti != null) {
            c949720ap0 = c20410414ti.LIZ;
        } else {
            c949720ap0 = null;
        }
        this.LLLIIIIL = c949720ap0;
        final C410901il c410901il = new C410901il();
        for (C949720ap0 c949720ap03 : this.LLJZIJLIL) {
            if (c20410414ti != null) {
                c949720ap02 = c20410414ti.LIZ;
            } else {
                c949720ap02 = null;
            }
            c410901il.add(new C20410414ti(c949720ap03, Intrinsics.LJFF(c949720ap03, c949720ap02)));
        }
        final C410901il c410901il2 = new C410901il(this.LLLIIII.LL);
        try {
            C21341918fZ c21341918fZLIZ = C21342318fd.LIZ(new AbstractC21342018fa(c410901il2, c410901il) { // from class: X.14te
                public final C410901il LIZ;
                public final C410901il LIZIZ;

                @Override // X.AbstractC21342018fa
                public final int LIZLLL() {
                    return this.LIZIZ.size();
                }

                @Override // X.AbstractC21342018fa
                public final int LJ() {
                    return this.LIZ.size();
                }

                {
                    this.LIZ = c410901il2;
                    this.LIZIZ = c410901il;
                }

                @Override // X.AbstractC21342018fa
                public final boolean LIZ(int i, int i2) {
                    if (i < this.LIZ.size() && i2 < this.LIZIZ.size()) {
                        Object obj = this.LIZ.get(i);
                        Object obj2 = this.LIZIZ.get(i2);
                        if ((obj instanceof C20410414ti) && (obj2 instanceof C20410414ti)) {
                            C20410414ti c20410414ti2 = (C20410414ti) obj;
                            C20410414ti c20410414ti3 = (C20410414ti) obj2;
                            if (Intrinsics.LJFF(c20410414ti2.LIZ, c20410414ti3.LIZ) && c20410414ti2.LIZIZ == c20410414ti3.LIZIZ) {
                                return true;
                            }
                            return false;
                        }
                        return false;
                    }
                    return false;
                }

                @Override // X.AbstractC21342018fa
                public final boolean LIZIZ(int i, int i2) {
                    if (i >= this.LIZ.size() || i2 >= this.LIZIZ.size() || this.LIZ.get(i).getClass() != this.LIZIZ.get(i2).getClass()) {
                        return false;
                    }
                    return true;
                }
            }, true);
            C1117360fBO c1117360fBO = this.LLLIIII;
            c1117360fBO.LL = c410901il;
            c21341918fZLIZ.LIZJ(c1117360fBO);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1117360fBO c1117360fBO2 = this.LLLIIII;
            c1117360fBO2.LL = c410901il;
            c1117360fBO2.notifyDataSetChanged();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("feedbackItemSelect failed:");
            sbLIZ.append(th.getMessage());
            C20441214yg.LJ("feedbackItemSelect", C2188811AlT.LIZIZ(sbLIZ));
        }
        ES();
    }

    public final void FS(CharSequence charSequence) {
        int length;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (charSequence != null) {
            length = charSequence.length();
        } else {
            length = 0;
        }
        spannableStringBuilder.append((CharSequence) String.valueOf(length));
        if (length > 200) {
            C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(C20736316Cj.LIZIZ(R.attr.ezu, getContext())), 0, spannableStringBuilder.length(), 33);
        }
        spannableStringBuilder.append((CharSequence) "/200");
        TextView textView = this.LLLFZ;
        if (textView != null) {
            textView.setText(spannableStringBuilder);
        }
        ES();
    }

    @Override // X.InterfaceC20410614tk
    public final void Y7(C20410414ti c20410414ti) {
        BS(c20410414ti);
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookSheetFragment, com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptionsIS = super.iS(context);
        sheetOptionsIS.LIZ(2, null);
        return sheetOptionsIS;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final void mS(boolean z) {
        if (z) {
            C500260Jjc.LJLJLJ(this.LLLF, true);
        } else {
            C500260Jjc.LJLJLJ(this.LLLF, false);
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final void x1(int i) {
        bS(false);
    }

    public PlaybookFeedbackDialog(PlaybookAnchorViewModel playbookAnchorViewModel, List list) {
        this.LLJZIJLIL = list;
        this.LLL = playbookAnchorViewModel;
        C1117360fBO c1117360fBO = new C1117360fBO();
        c1117360fBO.LLLI(C20410414ti.class, new AbstractC960460b6K<C20410414ti, C20410814tm>(this) { // from class: X.14uM
            public final InterfaceC20410614tk LIZIZ;

            {
                this.LIZIZ = this;
            }

            @Override // X.C0J8P
            /* JADX INFO: renamed from: LJ */
            public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                C20743416Fc c20743416Fc = new C20743416Fc(viewGroup.getContext());
                RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(-1, C439101nJ.LIZ(36));
                c20743416Fc.setGravity(17);
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c20743416Fc);
                c20743416Fc.setLayoutParams(layoutParams);
                return new C20410814tm(c20743416Fc, this.LIZIZ);
            }
        });
        this.LLLIIII = c1117360fBO;
        this.LLLIIIL = "feedback";
        this.LLLIIL = C452501pT.LIZIZ(new C20410314th(this));
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.LLLF = view.findViewById(R.id.fyx);
        this.LLLFF = (RecyclerView) view.findViewById(R.id.tvw);
        this.LLLFFI = (EditText) view.findViewById(R.id.grz);
        this.LLLFZ = (TextView) view.findViewById(R.id.zr0);
        this.LLLI = view.findViewById(R.id.cny);
        this.LLLII = (C16FS) view.findViewById(R.id.cvd);
        RecyclerView recyclerView = this.LLLFF;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 2));
        }
        RecyclerView recyclerView2 = this.LLLFF;
        if (recyclerView2 != null) {
            recyclerView2.addItemDecoration(new C0DXR() { // from class: X.0Gyc
                @Override // X.C0DXR
                public final void LIZIZ(Rect rect, View view2, RecyclerView recyclerView3, C21673919s1 c21673919s1) {
                    Context context;
                    RecyclerView.ViewHolder childViewHolder = recyclerView3.getChildViewHolder(view2);
                    if (childViewHolder != null) {
                        PlaybookFeedbackDialog playbookFeedbackDialog = this.LL;
                        if (childViewHolder.getLayoutPosition() / 2 > 0) {
                            rect.top = C439101nJ.LIZ(4);
                            rect.bottom = C439101nJ.LIZ(4);
                        } else {
                            rect.bottom = C439101nJ.LIZ(4);
                        }
                        if (childViewHolder.getLayoutPosition() % 2 == 0 && (context = playbookFeedbackDialog.getContext()) != null && !C426750GoL.LIZLLL(context)) {
                            rect.right = C439101nJ.LIZ(4);
                        } else {
                            rect.left = C439101nJ.LIZ(4);
                        }
                    }
                }
            });
        }
        RecyclerView recyclerView3 = this.LLLFF;
        if (recyclerView3 != null) {
            recyclerView3.setAdapter(this.LLLIIII);
        }
        View view2 = this.LLLI;
        if (view2 != null) {
            C786410Ut5.I7(new View.OnClickListener() { // from class: X.14tf
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    this.LL.close(1);
                }
            }, view2);
        }
        C16FS c16fs = this.LLLII;
        if (c16fs != null) {
            C786410Ut5.h8(c16fs, new View.OnClickListener() { // from class: X.14tb
                /* JADX WARN: Type inference failed for: r5v1, types: [X.14tc] */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) throws Throwable {
                    Editable editableLLJILLL;
                    Editable editableLLJILLL2;
                    C949720ap0 c949720ap0 = this.LL.LLLIIIIL;
                    if (c949720ap0 == null) {
                        return;
                    }
                    C1304660k3U c1304660k3U = C1304660k3U.LIZ;
                    StringBuilder sb = new StringBuilder("feedbackType: ");
                    sb.append(c949720ap0.LIZ);
                    sb.append(", feedbackContent: ");
                    EditText editText = this.LL.LLLFFI;
                    if (editText != null) {
                        editableLLJILLL = C2204961BRm.LLJILLL(editText, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yeeYEJJ97iNZknTVMu//6lsVPlMF/xh3yMjXB9EX+N5cT+2VtFZpmdg6UUTXIC64GxEhOUcCM/MYEStRVPIPHo9XaOFpkpT4ZplCMR0=", null));
                    } else {
                        editableLLJILLL = null;
                    }
                    sb.append((Object) editableLLJILLL);
                    c1304660k3U.LIZ(120001, sb.toString(), null);
                    C915190ZvJ c915190ZvJ = C978360bZC.LIZJ;
                    C978360bZC.LJIIIIZZ("submit", this.LL.LLJZIJLIL, c949720ap0);
                    final PlaybookFeedbackDialog playbookFeedbackDialog = this.LL;
                    int i = c949720ap0.LIZ;
                    EditText editText2 = playbookFeedbackDialog.LLLFFI;
                    if (editText2 != null) {
                        editableLLJILLL2 = C2204961BRm.LLJILLL(editText2, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yeeYEJJ97iNZknTVMu//6lsVPlMF/xh3yMjXB9EX+N5cT+2VtFZpmdg6UUTXIC64GxEhOUcCM/MYEStRVPIPHo9XaOFpkpT4ZplCMR0=", null));
                    } else {
                        editableLLJILLL2 = null;
                    }
                    String strValueOf = String.valueOf(editableLLJILLL2);
                    C16FS c16fs2 = playbookFeedbackDialog.LLLII;
                    if (c16fs2 != null) {
                        c16fs2.LJ();
                    }
                    PlaybookAnchorViewModel playbookAnchorViewModel = playbookFeedbackDialog.LLL;
                    if (playbookAnchorViewModel != null) {
                        final ?? r5 = new InterfaceC170900l9<C470590Icr<UserFeedbackResponse.ResponseData>>() { // from class: X.14tc
                            @Override // X.InterfaceC170900l9
                            public final void LIZ(C470590Icr<UserFeedbackResponse.ResponseData> c470590Icr) {
                                C16FS c16fs3 = playbookFeedbackDialog.LLLII;
                                if (c16fs3 != null) {
                                    c16fs3.LJIIL();
                                }
                                C766270U4b.LIZLLL(2131852498);
                                playbookFeedbackDialog.close(1);
                            }

                            @Override // X.InterfaceC170900l9
                            public final void onFailed(Throwable th) {
                                C16FS c16fs3 = playbookFeedbackDialog.LLLII;
                                if (c16fs3 != null) {
                                    c16fs3.LJIIL();
                                }
                                C766270U4b.LIZLLL(2131852494);
                            }
                        };
                        C20441214yg.LIZIZ("PlaybookAnchorViewModel", "sendUserFeedback");
                        C20384514pX c20384514pX = playbookAnchorViewModel.LLJJJJJIL;
                        UserFeedbackParams userFeedbackParams = new UserFeedbackParams();
                        userFeedbackParams.type = i;
                        userFeedbackParams.content = strValueOf;
                        c20384514pX.getClass();
                        String strLIZ = C01EI.LIZ(0, "PlaybookAnchorModel");
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("sendUserFeedback userFeedbackParams=");
                        sbLIZ.append(userFeedbackParams.type);
                        C1AZW.LJIIJ(12, strLIZ, C2188811AlT.LIZIZ(sbLIZ), null, null);
                        C480460Ism.LIZ().getClass();
                        C19487311Lz.LIZJ(C01NB.LIZIZ(((IPlaybookApi) C480460Ism.LIZLLL(IPlaybookApi.class)).sendUserFeedback(userFeedbackParams), "PlaybookAnchorModel", "user_feedback").LJJIJIIJI(C11S5.LIZ()).LJJ(C405101hp.LIZLLL).LJFF(new C0UO0()), playbookAnchorViewModel.vQ2(), new C09JN() { // from class: X.00l8
                            @Override // X.C09JN
                            public final void accept(Object obj) {
                                C1C7U.LIZ("PlaybookAnchorViewModel@aab5.sendUserFeedback$2");
                                InterfaceC170900l9<C470590Icr<UserFeedbackResponse.ResponseData>> interfaceC170900l9 = r5;
                                if (interfaceC170900l9 != null) {
                                    interfaceC170900l9.LIZ(obj);
                                }
                                C1C7U.LIZIZ("PlaybookAnchorViewModel@aab5.sendUserFeedback$2");
                            }
                        }, new C09JN() { // from class: X.00l7
                            @Override // X.C09JN
                            public final void accept(Object obj) {
                                C1C7U.LIZ("PlaybookAnchorViewModel@aab5.sendUserFeedback$3");
                                Throwable th = (Throwable) obj;
                                InterfaceC170900l9<C470590Icr<UserFeedbackResponse.ResponseData>> interfaceC170900l9 = r5;
                                if (interfaceC170900l9 != null) {
                                    interfaceC170900l9.onFailed(th);
                                }
                                C1C7U.LIZIZ("PlaybookAnchorViewModel@aab5.sendUserFeedback$3");
                            }
                        }, 24);
                    }
                }
            });
        }
        EditText editText = this.LLLFFI;
        if (editText != null) {
            editText.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(500)});
        }
        EditText editText2 = this.LLLFFI;
        if (editText2 != null) {
            editText2.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: X.14td
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view3, boolean z) {
                    Editable editableLLJILLL;
                    if (z) {
                        EditText editText3 = this.LL.LLLFFI;
                        if (editText3 != null) {
                            editText3.setCursorVisible(true);
                        }
                        EditText editText4 = this.LL.LLLFFI;
                        if (editText4 != null && (editableLLJILLL = C2204961BRm.LLJILLL(editText4, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yeeYEJJ97iNZknTVMu//6lsVPlMF/xh3yMjXB9EX+N5cT+2VtFZpmdg6UUTXIC64GxEhOUcCM/MYEStRVPIPHo9XaOFpkpT4ZplCMR0=", null))) != null) {
                            int length = editableLLJILLL.length();
                            EditText editText5 = this.LL.LLLFFI;
                            if (editText5 != null) {
                                editText5.setSelection(length);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    EditText editText6 = this.LL.LLLFFI;
                    if (editText6 == null) {
                        return;
                    }
                    editText6.setCursorVisible(false);
                }
            });
        }
        EditText editText3 = this.LLLFFI;
        if (editText3 != null) {
            editText3.addTextChangedListener((C20410214tg) this.LLLIIL.getValue());
        }
        EditText editText4 = this.LLLFFI;
        if (editText4 != null) {
            editText4.setOnTouchListener(new View.OnTouchListener() { // from class: X.0Gyd
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view3, MotionEvent motionEvent) {
                    int height;
                    int height2;
                    Layout layout;
                    EditText editText5 = this.LL.LLLFFI;
                    if (editText5 != null && view3.getId() == editText5.getId()) {
                        EditText editText6 = this.LL.LLLFFI;
                        if (editText6 != null && (layout = editText6.getLayout()) != null) {
                            height = layout.getHeight();
                        } else {
                            height = 0;
                        }
                        EditText editText7 = this.LL.LLLFFI;
                        if (editText7 != null) {
                            height2 = (editText7.getHeight() - editText7.getPaddingTop()) - editText7.getPaddingBottom();
                        } else {
                            height2 = 0;
                        }
                        if (height >= height2) {
                            view3.getParent().requestDisallowInterceptTouchEvent(true);
                            if (motionEvent.getAction() == 1) {
                                view3.getParent().requestDisallowInterceptTouchEvent(false);
                            }
                        }
                    }
                    return false;
                }
            });
        }
        if (C13LP.LJJJLL(this.LLJZIJLIL) == null) {
            close(1);
        } else {
            BS(null);
        }
        FS("");
        C915190ZvJ c915190ZvJ = C978360bZC.LIZJ;
        C978360bZC.LJIIIIZZ("show", this.LLJZIJLIL, null);
    }
}
