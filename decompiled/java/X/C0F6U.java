package X;

import Y.ARunnableS16S0101000_5;
import android.graphics.drawable.Animatable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.setting.CaptionConfig;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.inlinecaption.CaptionUtterance;
import com.ss.android.ugc.aweme.sticker.data.Utterance;
import com.ss.android.ugc.aweme.sticker.data.Word;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0F6U, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0F6U extends AbstractC21673619ry<C384580F6a> {
    public final C2216891Bpf LL;
    public final VideoPublishEditModel LLILLJJLI;
    public View LLILLL;
    public final C19EG LLILZIL;
    public final InterfaceC1452170ntP LLILZLL;
    public RecyclerView LLIZ;
    public int LLJ;
    public boolean LLJILJILJ;
    public LinearLayoutManager LLJJ;
    public String LLILZ = "";
    public ArrayList<CaptionUtterance> LLIZLLLIL = new ArrayList<>();
    public int LLJI = -1;
    public int LLJIJIL = -1;
    public int LLJILJIL = -1;
    public String LLJILLL = "";
    public final CaptionConfig LLJJI = new CaptionConfig(1, Integer.MAX_VALUE);
    public final C384630F6f LLJJIII = new InterfaceC1464200oCo() { // from class: X.0F6f
        @Override // X.InterfaceC1464200oCo
        public final void onCallback(int i, int i2, float f, String str) {
            if (i == 4098) {
                C0CNO.LIZLLL(0L, new AwS549S0100000_5(this.LL, 112));
            }
        }
    };

    public final void LLLFZ() {
        C384580F6a c384580F6a;
        int i = this.LLJIJIL;
        if (i < 0 || i >= this.LLIZLLLIL.size()) {
            return;
        }
        RecyclerView recyclerView = this.LLIZ;
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = recyclerView != null ? recyclerView.findViewHolderForAdapterPosition(this.LLJIJIL) : null;
        if ((viewHolderFindViewHolderForAdapterPosition instanceof C384580F6a) && (c384580F6a = (C384580F6a) viewHolderFindViewHolderForAdapterPosition) != null) {
            c384580F6a.LLILLL.cancelAnimation();
            if (this.LLJ == this.LLJIJIL) {
                C786410Ut5.LLD(8, c384580F6a.LLILLL);
                C786410Ut5.LJZI(0, c384580F6a.LLILLJJLI);
            }
        }
        this.LLJIJIL = -1;
    }

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLIZLLLIL.size();
    }

    @Override // X.AbstractC21673619ry
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        RecyclerView.LayoutManager layoutManager;
        super.onAttachedToRecyclerView(recyclerView);
        InterfaceC1452170ntP interfaceC1452170ntP = this.LLILZLL;
        if (interfaceC1452170ntP != null) {
            interfaceC1452170ntP.df(this.LLJJIII);
        }
        this.LLIZ = recyclerView;
        if (recyclerView != null) {
            layoutManager = recyclerView.getLayoutManager();
        } else {
            layoutManager = null;
        }
        this.LLJJ = (LinearLayoutManager) layoutManager;
    }

    @Override // X.AbstractC21673619ry
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        this.LLIZ = null;
        InterfaceC1452170ntP interfaceC1452170ntP = this.LLILZLL;
        if (interfaceC1452170ntP != null) {
            interfaceC1452170ntP.Gf(this.LLJJIII);
        }
    }

    @Override // X.AbstractC21673619ry
    public final void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        C384580F6a c384580F6a = (C384580F6a) viewHolder;
        c384580F6a.LL.setOnSelectionChangedListener(null);
        super.onViewRecycled(c384580F6a);
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, final int i) throws Throwable {
        boolean z;
        boolean z2;
        final C384580F6a c384580F6a = (C384580F6a) viewHolder;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fmc bind vh pos ");
        sbLIZ.append(i);
        sbLIZ.append(" hasFocus ");
        if (this.LLJ == i) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        C0F90 c0f90 = c384580F6a.LL;
        int visibility = c0f90.getVisibility();
        c0f90.setVisibility(0);
        C1602160rnK.LIZIZ(visibility, 0, c0f90);
        c384580F6a.LL.setText(((CaptionUtterance) ListProtector.get(this.LLIZLLLIL, i)).LJ());
        if (this.LLJI == i) {
            this.LLJI = -1;
        }
        c384580F6a.LL.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: X.0F6Y
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z3) throws Throwable {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("SubtitleEditAdapter onFocusChanged hasFocus ");
                sbLIZ2.append(z3);
                C201955140j.LJIIL(C2188811AlT.LIZIZ(sbLIZ2));
                if (z3) {
                    this.LL.LLJ = i;
                }
                this.LL.LLLI(c384580F6a, i, z3);
            }
        });
        if (this.LLJ == i) {
            z2 = true;
        } else {
            z2 = false;
        }
        LLLI(c384580F6a, i, z2);
        final CaptionUtterance captionUtterance = (CaptionUtterance) ListProtector.get(this.LLIZLLLIL, i);
        C0EZX.LIZIZ(c384580F6a.LLILLJJLI, 0.75f);
        C786410Ut5.Q7(c384580F6a.LLILLJJLI, new View.OnClickListener() { // from class: X.0F6V
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.LLLFZ();
                C0F6U c0f6u = this;
                c0f6u.LLJIJIL = i;
                InterfaceC1452170ntP interfaceC1452170ntP = c0f6u.LLILZLL;
                if (interfaceC1452170ntP != null) {
                    interfaceC1452170ntP.uf((int) captionUtterance.LIZJ(), (int) captionUtterance.LIZ());
                }
                InterfaceC1452170ntP interfaceC1452170ntP2 = this.LLILZLL;
                if (interfaceC1452170ntP2 != null) {
                    interfaceC1452170ntP2.play();
                }
                C1295960jpS c1295960jpS = c384580F6a.LLILLL;
                C786410Ut5.LLD(0, c1295960jpS);
                c1295960jpS.setAnimation("creation_audio_wave_anim_tux_lottie.json");
                c1295960jpS.setRepeatCount(-1);
                c1295960jpS.playAnimation();
                C786410Ut5.LJZI(8, c384580F6a.LLILLJJLI);
                C0F6U c0f6u2 = this;
                C1402610mbT.LJJJI(0, c0f6u2.LLILLJJLI, c0f6u2.LLILZ, c0f6u2.LLJILLL);
            }
        });
        c384580F6a.LL.setFilters(new InputFilter[]{new C0F9J(new InterfaceC384670F6j() { // from class: X.0F6I
            @Override // X.InterfaceC384670F6j
            public final void LIZ() {
                List<Word> listLIZJ;
                CaptionUtterance captionUtterance2;
                int selectionStart = c384580F6a.LL.getSelectionStart();
                int length = captionUtterance.LJ().length();
                if (selectionStart <= 0 || selectionStart >= length) {
                    return;
                }
                C0F6U c0f6u = this;
                CaptionUtterance captionUtterance3 = captionUtterance;
                int i2 = i;
                c0f6u.getClass();
                int length2 = captionUtterance3.LJ().length();
                if (selectionStart < length2) {
                    captionUtterance3.LJ();
                    String strSubstring = captionUtterance3.LJ().substring(selectionStart, length2);
                    long jLIZ = captionUtterance3.LIZ();
                    long jLIZ2 = ((captionUtterance3.LIZ() - captionUtterance3.LIZJ()) * ((long) selectionStart)) / ((long) length2);
                    long jLIZJ = (jLIZ - captionUtterance3.LIZJ()) - jLIZ2;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("SubtitleEditAdapter -> firstDuration = ");
                    sbLIZ2.append(jLIZ2);
                    sbLIZ2.append("; secondDuration = ");
                    sbLIZ2.append(jLIZJ);
                    C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
                    if (jLIZ2 < 100 || jLIZJ < 100) {
                        C19EG c19eg = c0f6u.LLILZIL;
                        CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                        creativeToastBuilder.messageRes(2131833390);
                        creativeToastBuilder.isTuxToastLegacy(true);
                        C1390380mHk.LIZ(c19eg, 1069, creativeToastBuilder);
                        return;
                    }
                    TextStickerData textStickerData = captionUtterance3.inlineUtterance;
                    if (textStickerData != null) {
                        List<Word> words = textStickerData.getWords();
                        C13BV c13bv = C13BV.INSTANCE;
                        if (textStickerData.getWords().isEmpty()) {
                            captionUtterance3.LJII(captionUtterance3.LIZJ() + jLIZ2);
                            listLIZJ = c13bv;
                        } else {
                            Pair<List<C349800DnW>, List<C349800DnW>> pairLIZIZ = new C349810DnX(new C363700ENs(textStickerData)).LIZIZ(selectionStart);
                            words = C349680DnK.LIZJ(pairLIZIZ.getFirst());
                            listLIZJ = C349680DnK.LIZJ(pairLIZIZ.getSecond());
                            Word word = (Word) C13LP.LJJJLL(words);
                            long startTime = word != null ? word.getStartTime() : 0L;
                            Word word2 = (Word) C13LP.LJJLIIIJL(words);
                            captionUtterance3.LJII(captionUtterance3.LIZJ() + ((word2 != null ? word2.getEndTime() : 0L) - startTime));
                        }
                        textStickerData.setClipStart(0L);
                        textStickerData.setClipEnd(((long) (textStickerData.getEndTime() - textStickerData.getStartTime())) * 1000);
                        textStickerData.setCacheWords(c13bv);
                        textStickerData.setWords(words);
                        captionUtterance3.LJIIIIZZ(c0f6u.LLILZIL, captionUtterance3.LJ().substring(0, selectionStart));
                        if (captionUtterance3.inlineUtterance != null) {
                            TextStickerData textStickerDataM187clone = textStickerData.m187clone();
                            textStickerDataM187clone.setTextStr(strSubstring);
                            textStickerDataM187clone.setStartTime((int) (captionUtterance3.LIZ() + 1));
                            textStickerDataM187clone.setEndTime((int) jLIZ);
                            textStickerDataM187clone.setTextWrapList(C1697810uHb.LJ(C123P.LIZJ(C123P.LJIILJJIL(textStickerDataM187clone, c0f6u.LLILZIL))));
                            textStickerDataM187clone.setClipStart(0L);
                            textStickerDataM187clone.setClipEnd(((long) (textStickerDataM187clone.getEndTime() - textStickerDataM187clone.getStartTime())) * 1000);
                            textStickerDataM187clone.setWords(listLIZJ);
                            textStickerDataM187clone.setCacheWords(c13bv);
                            captionUtterance2 = new CaptionUtterance((Utterance) null, textStickerDataM187clone);
                        } else {
                            captionUtterance2 = new CaptionUtterance(new Utterance(captionUtterance3.LIZ() + 1, jLIZ, strSubstring, "#00000000", "#00FFFFF", 0.0f, 0.0f, 22, 0, "", false), (TextStickerData) null);
                        }
                        int i3 = i2 + 1;
                        ListProtector.add(c0f6u.LLIZLLLIL, i3, captionUtterance2);
                        c0f6u.LLJI = i2;
                        c0f6u.LLJ = i3;
                        c0f6u.LLJILJIL = 0;
                        c0f6u.notifyItemRangeChanged(i2, c0f6u.getItemCount() - i2);
                        RecyclerView recyclerView = c0f6u.LLIZ;
                        if (recyclerView != null) {
                            HandlerHook.viewPost(recyclerView, new ARunnableS16S0101000_5(i3, c0f6u, 3));
                        }
                    }
                }
            }
        }), new C19534511bj(this.LLJJI.wordsPerLine)});
        c384580F6a.LL.addTextChangedListener(new TextWatcher() { // from class: X.0F6T
            @Override // android.text.TextWatcher
            public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            }

            @Override // android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            }

            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                if (editable != null && this.LL.LLJI == -1 && c384580F6a.getAdapterPosition() >= 0 && c384580F6a.getAdapterPosition() < this.LL.getItemCount()) {
                    Object obj = ListProtector.get(this.LL.LLIZLLLIL, c384580F6a.getAdapterPosition());
                    C384580F6a c384580F6a2 = c384580F6a;
                    C0F6U c0f6u = this.LL;
                    CaptionUtterance captionUtterance2 = (CaptionUtterance) obj;
                    if (!Intrinsics.LJFF(captionUtterance2.LJ(), String.valueOf(C2204961BRm.K(c384580F6a2.LL, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhj9fHnYUJBf+25L2uSsYY/FqubAd2GtMVLtMZag==", null))))) {
                        C1428470nHB.LLILZ(c0f6u.LLILLJJLI);
                    }
                    captionUtterance2.LJIIIIZZ(c0f6u.LLILZIL, String.valueOf(C2204961BRm.K(c384580F6a2.LL, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhj9fHnYUJBf+25L2uSsYY/FqubAd2GtMVLtMZag==", null))));
                }
            }
        });
        c384580F6a.LL.setSoftKeyListener(new View.OnKeyListener() { // from class: X.0F6K
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
                TextView textView;
                int selectionStart;
                if (view instanceof EditText) {
                    textView = (TextView) view;
                } else {
                    textView = null;
                }
                if (textView != null) {
                    selectionStart = textView.getSelectionStart();
                } else {
                    selectionStart = 0;
                }
                if (keyEvent == null || keyEvent.getKeyCode() != 67 || keyEvent.getAction() != 0 || selectionStart != 0) {
                    return false;
                }
                C0F6U c0f6u = this.LL;
                CaptionUtterance captionUtterance2 = captionUtterance;
                int i3 = i;
                if (i3 == 0) {
                    c0f6u.getClass();
                } else {
                    int i4 = i3 - 1;
                    CaptionUtterance captionUtterance3 = (CaptionUtterance) ListProtector.get(c0f6u.LLIZLLLIL, i4);
                    captionUtterance3.LJII(captionUtterance2.LIZ());
                    int length = captionUtterance3.LJ().length();
                    TextStickerData textStickerData = captionUtterance3.inlineUtterance;
                    TextStickerData textStickerData2 = captionUtterance2.inlineUtterance;
                    if (textStickerData != null && textStickerData2 != null) {
                        textStickerData.setWords(C349680DnK.LIZJ(new C349820DnY(new C363700ENs(textStickerData), new C363700ENs(textStickerData2)).LIZIZ()));
                        textStickerData.setCacheWords(C13BV.INSTANCE);
                        textStickerData.setClipStart(0L);
                        textStickerData.setClipEnd(((long) (textStickerData.getEndTime() - textStickerData.getStartTime())) * 1000);
                    }
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(captionUtterance3.LJ());
                    sbLIZ2.append(captionUtterance2.LJ());
                    captionUtterance3.LJIIIIZZ(c0f6u.LLILZIL, C2188811AlT.LIZIZ(sbLIZ2));
                    ListProtector.remove(c0f6u.LLIZLLLIL, i3);
                    c0f6u.LLJ = i4;
                    c0f6u.LLJILJIL = length;
                    c0f6u.LLJILJILJ = true;
                    c0f6u.notifyItemRangeChanged(i4, (c0f6u.getItemCount() - i3) + 2);
                    RecyclerView recyclerView = c0f6u.LLIZ;
                    if (recyclerView != null) {
                        HandlerHook.viewPost(recyclerView, new ARunnableS16S0101000_5(i3, c0f6u, 2));
                        return true;
                    }
                }
                return true;
            }
        });
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        this.LLILLL = C786410Ut5.Td(C786410Ut5.ne(this.LLILZIL), R.layout.fio, viewGroup, false);
        View view = this.LLILLL;
        if (view == null) {
            view = null;
        }
        C384580F6a c384580F6a = new C384580F6a(view);
        try {
            View view2 = c384580F6a.itemView;
            if (view2 != null) {
                view2.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c384580F6a.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c384580F6a.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C384580F6a.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c384580F6a.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c384580F6a.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C384580F6a.class.getName();
        return c384580F6a;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [X.0F6f] */
    public C0F6U(C2216891Bpf c2216891Bpf, VideoPublishEditModel videoPublishEditModel, InterfaceC1455860nzM interfaceC1455860nzM) {
        this.LL = c2216891Bpf;
        this.LLILLJJLI = videoPublishEditModel;
        this.LLILZIL = (C19EG) c2216891Bpf.LIZIZ.requireActivity();
        this.LLILZLL = interfaceC1455860nzM.g().getValue();
        new C1320700kTM<InterfaceC1330440kj4>() { // from class: X.196G
            @Override // X.C1320700kTM, X.InterfaceC1320650kTH
            public final void LJ(String str, Object obj, Animatable animatable) {
                if (animatable != null) {
                    animatable.start();
                }
            }
        };
    }

    public final void LLLI(C384580F6a c384580F6a, int i, boolean z) throws Throwable {
        int length;
        if (!z) {
            c384580F6a.itemView.setBackgroundResource(0);
            c384580F6a.LL.setTextColor(C960203pA.LIZ(R.attr.eh, this.LLILZIL));
            c384580F6a.LL.clearFocus();
        } else {
            c384580F6a.LL.requestFocus();
            c384580F6a.LL.setTextColor(C960203pA.LIZ(R.attr.ee, this.LLILZIL));
            c384580F6a.itemView.setBackgroundColor(C960203pA.LIZ(R.attr.dz, this.LLILZIL));
            int i2 = this.LLJILJIL;
            if (i2 >= 0) {
                Editable editableK = C2204961BRm.K(c384580F6a.LL, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhj9fHnYUJBf+25L2uSsYY/FqubAd2GtMVLtMZag==", null));
                if (editableK != null) {
                    length = editableK.length();
                } else {
                    length = 0;
                }
                if (i2 <= length) {
                    C201955140j.LJIIL("SubtitleEditAdapter set bind selection focusIndex " + this.LLJ + " selectIndex " + this.LLJILJIL);
                    c384580F6a.LL.setSelection(this.LLJILJIL);
                }
            }
            c384580F6a.LL.setOnSelectionChangedListener(new InterfaceC384650F6h() { // from class: X.0F6g
                @Override // X.InterfaceC384650F6h
                public final void LIZ(int i3) {
                    C0F6U c0f6u = this.LIZ;
                    if (c0f6u.LLJILJILJ) {
                        return;
                    }
                    c0f6u.LLJILJIL = i3;
                }
            });
            this.LL.LJI.showSoftInput(c384580F6a.LL, 1);
        }
        if (this.LLJIJIL == i) {
            if (z) {
                C786410Ut5.LJZI(8, c384580F6a.LLILLJJLI);
                C786410Ut5.LLD(0, c384580F6a.LLILLL);
                return;
            }
        } else if (z) {
            C786410Ut5.LJZI(0, c384580F6a.LLILLJJLI);
            C786410Ut5.LLD(8, c384580F6a.LLILLL);
            return;
        }
        C786410Ut5.LJZI(8, c384580F6a.LLILLJJLI);
        C786410Ut5.LLD(8, c384580F6a.LLILLL);
    }
}
