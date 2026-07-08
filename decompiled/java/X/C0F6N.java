package X;

import Y.ACListenerS40S0201000_5;
import Y.ARunnableS16S0101000_5;
import android.app.Activity;
import android.content.Context;
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
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextWrap;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.sticker.data.Word;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0F6N, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0F6N extends AbstractC21673619ry<C384590F6b> {
    public final VideoPublishEditModel LL;
    public final C0E48 LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final C0F6L LLILZIL;
    public View LLILZLL;
    public RecyclerView LLIZLLLIL;
    public LinearLayoutManager LLJ;
    public int LLJI;
    public boolean LLJILLL;
    public Context LLJJ;
    public final ArrayList<TextStickerData> LLIZ = new ArrayList<>();
    public int LLJIJIL = -1;
    public int LLJILJIL = -1;
    public int LLJILJILJ = -1;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLIZ.size();
    }

    @Override // X.AbstractC21673619ry
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        RecyclerView.LayoutManager layoutManager;
        super.onAttachedToRecyclerView(recyclerView);
        this.LLIZLLLIL = recyclerView;
        if (recyclerView != null) {
            layoutManager = recyclerView.getLayoutManager();
        } else {
            layoutManager = null;
        }
        this.LLJ = (LinearLayoutManager) layoutManager;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, final int i) throws Throwable {
        boolean z;
        final C384590F6b c384590F6b = (C384590F6b) viewHolder;
        C0F90 c0f90 = c384590F6b.LL;
        int visibility = c0f90.getVisibility();
        c0f90.setVisibility(0);
        C1602160rnK.LIZIZ(visibility, 0, c0f90);
        c384590F6b.LL.setText(((TextStickerData) ListProtector.get(this.LLIZ, i)).getTextStr());
        if (this.LLJIJIL == i) {
            this.LLJIJIL = -1;
        }
        c384590F6b.LL.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: X.0F6Z
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z2) throws Throwable {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("SubtitleEditAdapter onFocusChanged hasFocus ");
                sbLIZ.append(z2);
                C201955140j.LJIIL(C2188811AlT.LIZIZ(sbLIZ));
                if (z2) {
                    this.LLJI = i;
                }
                this.LLLFZ(c384590F6b, i, z2);
            }
        });
        if (this.LLJI == i) {
            z = true;
        } else {
            z = false;
        }
        LLLFZ(c384590F6b, i, z);
        C0EZX.LIZIZ(c384590F6b.LLILLJJLI, 0.75f);
        C786410Ut5.Q7(c384590F6b.LLILLJJLI, new ACListenerS40S0201000_5(i, c384590F6b, this, 5));
        c384590F6b.LL.setFilters(new InputFilter[]{new C0F9J(new InterfaceC384670F6j() { // from class: X.0F6G
            @Override // X.InterfaceC384670F6j
            public final void LIZ() {
                List<Word> listLIZJ;
                int selectionStart = c384590F6b.LL.getSelectionStart();
                int length = ((TextStickerData) ListProtector.get(this.LLIZ, i)).getTextStr().length();
                if (selectionStart <= 0 || selectionStart >= length) {
                    return;
                }
                C0F6N c0f6n = this;
                TextStickerData textStickerData = (TextStickerData) ListProtector.get(c0f6n.LLIZ, i);
                int i2 = i;
                String textStr = textStickerData.getTextStr();
                if (textStr != null) {
                    int length2 = textStr.length();
                    int startTime = textStickerData.getStartTime();
                    int endTime = textStickerData.getEndTime();
                    TextStickerData textStickerData2 = new TextStickerData(null, 0, 0, 0, null, null, 0, 0, 0, 0, null, null, false, null, 0L, 0L, 0.0f, 0.0f, 0L, false, false, false, null, null, 0.0f, 0.0f, false, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, null, null, null, null, false, false, null, null, false, false, false, false, null, -1, -1, -1, 4095, null);
                    if (selectionStart < length2) {
                        if (textStickerData.getTextStr() != null) {
                            int endTime2 = ((textStickerData.getEndTime() - textStickerData.getStartTime()) * selectionStart) / length2;
                            int i3 = (endTime - startTime) - endTime2;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("InlineCaptionTextFragment -> CaptionEditAdapter -> firstDuration = ");
                            sbLIZ.append(endTime2);
                            sbLIZ.append("; secondDuration = ");
                            sbLIZ.append(i3);
                            C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                            if (endTime2 < 100 || i3 < 100) {
                                Context context = c0f6n.LLJJ;
                                if (context == null) {
                                    context = null;
                                }
                                Activity activityLIZ = C1388190mED.LIZ(context);
                                if (activityLIZ != null) {
                                    CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                                    creativeToastBuilder.messageRes(2131833390);
                                    creativeToastBuilder.isTuxToastLegacy(true);
                                    C1390380mHk.LIZ(activityLIZ, 1069, creativeToastBuilder);
                                    return;
                                }
                                return;
                            }
                        }
                        List<Word> words = textStickerData.getWords();
                        C13BV c13bv = C13BV.INSTANCE;
                        if (textStickerData.getWords().isEmpty()) {
                            textStickerData.setEndTime(textStickerData.getStartTime() + (((textStickerData.getEndTime() - textStickerData.getStartTime()) * selectionStart) / length2));
                            listLIZJ = c13bv;
                        } else {
                            Pair<List<C349800DnW>, List<C349800DnW>> pairLIZIZ = new C349810DnX(new C363700ENs(textStickerData)).LIZIZ(selectionStart);
                            words = C349680DnK.LIZJ(pairLIZIZ.getFirst());
                            listLIZJ = C349680DnK.LIZJ(pairLIZIZ.getSecond());
                            Word word = (Word) C13LP.LJJJLL(words);
                            long startTime2 = word != null ? word.getStartTime() : 0L;
                            Word word2 = (Word) C13LP.LJJLIIIJL(words);
                            textStickerData.setEndTime(textStickerData.getStartTime() + ((int) ((word2 != null ? word2.getEndTime() : 0L) - startTime2)));
                        }
                        textStickerData.setClipStart(0L);
                        textStickerData.setClipEnd(((long) (textStickerData.getEndTime() - textStickerData.getStartTime())) * 1000);
                        textStickerData.setCacheWords(c13bv);
                        textStickerData.setWords(words);
                        String strSubstring = textStr.substring(selectionStart, length2);
                        String strSubstring2 = textStr.substring(0, selectionStart);
                        Context context2 = c0f6n.LLJJ;
                        if (context2 == null) {
                            context2 = null;
                        }
                        C363730ENv.LJIIIZ(textStickerData, strSubstring2, context2);
                        textStickerData2 = textStickerData.m187clone();
                        textStickerData2.setTextStr(strSubstring);
                        textStickerData2.setStartTime(textStickerData2.getEndTime() + 1);
                        textStickerData2.setEndTime(endTime);
                        TextStickerTextWrap[] textStickerTextWrapArr = new TextStickerTextWrap[1];
                        Context context3 = c0f6n.LLJJ;
                        if (context3 == null) {
                            context3 = null;
                        }
                        textStickerTextWrapArr[0] = C123P.LIZJ(C123P.LJIILJJIL(textStickerData2, context3));
                        textStickerData2.setTextWrapList(C1697810uHb.LJ(textStickerTextWrapArr));
                        textStickerData2.setClipStart(0L);
                        textStickerData2.setClipEnd(((long) (textStickerData2.getEndTime() - textStickerData2.getStartTime())) * 1000);
                        textStickerData2.setCacheWords(c13bv);
                        textStickerData2.setWords(listLIZJ);
                        int i4 = i2 + 1;
                        ListProtector.add(c0f6n.LLIZ, i4, textStickerData2);
                        c0f6n.LLJIJIL = i2;
                        c0f6n.LLJI = i4;
                        c0f6n.LLJILJILJ = 0;
                        c0f6n.notifyItemRangeChanged(i2, c0f6n.getItemCount() - i2);
                        RecyclerView recyclerView = c0f6n.LLIZLLLIL;
                        if (recyclerView != null) {
                            HandlerHook.viewPost(recyclerView, new ARunnableS16S0101000_5(i4, c0f6n, 9));
                        }
                    }
                    c0f6n.LLILZIL.Yt(new Pair<>(Integer.valueOf(startTime), Integer.valueOf(endTime)), textStickerData, textStickerData2);
                }
            }
        }), new C19534511bj(Integer.MAX_VALUE)});
        c384590F6b.LL.addTextChangedListener(new TextWatcher() { // from class: X.0F6M
            @Override // android.text.TextWatcher
            public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            }

            @Override // android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            }

            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                if (editable != null) {
                    C0F6N c0f6n = this;
                    if (c0f6n.LLJIJIL == -1) {
                        int itemCount = c0f6n.getItemCount();
                        int adapterPosition = c384590F6b.getAdapterPosition();
                        if (adapterPosition >= 0 && adapterPosition < itemCount) {
                            TextStickerData textStickerData = (TextStickerData) ListProtector.get(this.LLIZ, c384590F6b.getAdapterPosition());
                            Context context = null;
                            String strValueOf = String.valueOf(C2204961BRm.K(c384590F6b.LL, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF384cWghZ6StZ5ba0yCqDphSc3PUugRuGpmbQG3oPBE6j4JN3o9J/dVg18mdHrJGWswz9EzyYijm6U5t4Sd2GnClV6uFKOmVaA==", null)));
                            Context context2 = this.LLJJ;
                            if (context2 != null) {
                                context = context2;
                            }
                            C363730ENv.LJIIIZ(textStickerData, strValueOf, context);
                            C0F6N c0f6n2 = this;
                            c0f6n2.LLILZIL.kO((TextStickerData) ListProtector.get(c0f6n2.LLIZ, c384590F6b.getAdapterPosition()), i, c384590F6b.LL.getHeight());
                        }
                    }
                }
            }
        });
        c384590F6b.LL.setSoftKeyListener(new View.OnKeyListener() { // from class: X.0F6J
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
                TextView textView;
                int selectionStart;
                if (view instanceof EditText) {
                    textView = (TextView) view;
                } else {
                    textView = null;
                }
                int length = 0;
                if (textView != null) {
                    selectionStart = textView.getSelectionStart();
                } else {
                    selectionStart = 0;
                }
                if (keyEvent != null && keyEvent.getKeyCode() == 67 && keyEvent.getAction() == 0 && selectionStart == 0) {
                    if (C13LP.LJJJLZIJ(i, this.LL.LLIZ) != null) {
                        TextStickerData textStickerData = (TextStickerData) C13LP.LJJJLZIJ(i, this.LL.LLIZ);
                        if (textStickerData != null) {
                            C0F6N c0f6n = this.LL;
                            int i3 = i;
                            if (i3 == 0) {
                                c0f6n.getClass();
                            } else {
                                int i4 = i3 - 1;
                                TextStickerData textStickerData2 = (TextStickerData) ListProtector.get(c0f6n.LLIZ, i4);
                                Pair<Integer, Integer> pair = new Pair<>(Integer.valueOf(textStickerData2.getStartTime()), Integer.valueOf(textStickerData2.getEndTime()));
                                Pair<Integer, Integer> pair2 = new Pair<>(Integer.valueOf(textStickerData.getStartTime()), Integer.valueOf(textStickerData.getEndTime()));
                                textStickerData2.setEndTime(textStickerData.getEndTime());
                                String textStr = textStickerData2.getTextStr();
                                if (textStr != null) {
                                    length = textStr.length();
                                }
                                textStickerData2.setWords(C349680DnK.LIZJ(new C349820DnY(new C363700ENs(textStickerData2), new C363700ENs(textStickerData)).LIZIZ()));
                                textStickerData2.setCacheWords(C13BV.INSTANCE);
                                textStickerData2.setClipStart(0L);
                                textStickerData2.setClipEnd(((long) (textStickerData2.getEndTime() - textStickerData2.getStartTime())) * 1000);
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append(textStickerData2.getTextStr());
                                sbLIZ.append(textStickerData.getTextStr());
                                textStickerData2.setTextStr(C2188811AlT.LIZIZ(sbLIZ));
                                c0f6n.LLILZIL.sr(textStickerData2, pair, textStickerData, pair2);
                                ListProtector.remove(c0f6n.LLIZ, i3);
                                c0f6n.LLJI = i4;
                                c0f6n.LLJILJILJ = length;
                                c0f6n.LLJILLL = true;
                                c0f6n.notifyItemRemoved(i3);
                                c0f6n.notifyItemRangeChanged(i4, (c0f6n.getItemCount() - i3) + 2);
                                RecyclerView recyclerView = c0f6n.LLIZLLLIL;
                                if (recyclerView != null) {
                                    HandlerHook.viewPost(recyclerView, new ARunnableS16S0101000_5(i3, c0f6n, 8));
                                    return true;
                                }
                            }
                        }
                        return true;
                    }
                }
                return false;
            }
        });
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        this.LLILZLL = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.fio, viewGroup, false);
        this.LLJJ = viewGroup.getContext();
        View view = this.LLILZLL;
        if (view == null) {
            view = null;
        }
        C384590F6b c384590F6b = new C384590F6b(view);
        try {
            View view2 = c384590F6b.itemView;
            if (view2 != null) {
                view2.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c384590F6b.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c384590F6b.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C384590F6b.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c384590F6b.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c384590F6b.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C384590F6b.class.getName();
        return c384590F6b;
    }

    public final void LLLFZ(C384590F6b c384590F6b, int i, boolean z) throws Throwable {
        int length;
        Context context = null;
        if (!z) {
            c384590F6b.itemView.setBackgroundResource(0);
            C0F90 c0f90 = c384590F6b.LL;
            Context context2 = this.LLJJ;
            if (context2 != null) {
                context = context2;
            }
            c0f90.setTextColor(C960203pA.LIZ(R.attr.eh, context));
            C201955140j.LJIIL("InlineCaptionTextFragment -> CaptionEditAdapter -> onBindViewHolder: fmc clearFocus pos " + i + " curFocusIndex " + this.LLJI);
            c384590F6b.LL.clearFocus();
        } else {
            C201955140j.LJIIL("InlineCaptionTextFragment -> CaptionEditAdapter -> onBindViewHolder: fmc requestFocus pos " + i + " curFocusIndex " + this.LLJI);
            c384590F6b.LL.requestFocus();
            C0F90 c0f902 = c384590F6b.LL;
            Context context3 = this.LLJJ;
            if (context3 == null) {
                context3 = null;
            }
            c0f902.setTextColor(C960203pA.LIZ(R.attr.ee, context3));
            View view = c384590F6b.itemView;
            Context context4 = this.LLJJ;
            if (context4 == null) {
                context4 = null;
            }
            view.setBackgroundColor(C960203pA.LIZ(R.attr.dz, context4));
            int i2 = this.LLJILJILJ;
            if (i2 >= 0) {
                Editable editableK = C2204961BRm.K(c384590F6b.LL, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF384cWghZ6StZ5ba0yCqDphSc3PUugRuGpmbQG3oPBE6j4JN3o9J/dVg18mdHrJGWswz9EzyYijm6U5t4Sd2GnClV6uFKOmVaA==", null));
                if (editableK != null) {
                    length = editableK.length();
                } else {
                    length = 0;
                }
                if (i2 <= length) {
                    C201955140j.LJIIL("InlineCaptionTextFragment -> CaptionEditAdapter set bind selection focusIndex " + this.LLJI + " selectIndex " + this.LLJILJILJ);
                    c384590F6b.LL.setSelection(this.LLJILJILJ);
                }
            }
            c384590F6b.LL.setOnSelectionChangedListener(new InterfaceC384650F6h() { // from class: X.0F6X
                @Override // X.InterfaceC384650F6h
                public final void LIZ(int i3) {
                    if (this.LIZ.LLJILLL) {
                        return;
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("InlineCaptionTextFragment -> CaptionEditAdapter -> onSelectionChanged selStart ");
                    sbLIZ.append(i3);
                    C201955140j.LJIIL(C2188811AlT.LIZIZ(sbLIZ));
                    this.LIZ.LLJILJILJ = i3;
                }
            });
            this.LLILZIL.Wf(c384590F6b.LL);
        }
        if (this.LLJILJIL == i) {
            if (z) {
                C786410Ut5.LJZI(8, c384590F6b.LLILLJJLI);
                C786410Ut5.LLD(0, c384590F6b.LLILLL);
                return;
            }
        } else if (z) {
            C786410Ut5.LJZI(0, c384590F6b.LLILLJJLI);
            C786410Ut5.LLD(8, c384590F6b.LLILLL);
            return;
        }
        C786410Ut5.LJZI(8, c384590F6b.LLILLJJLI);
        C786410Ut5.LLD(8, c384590F6b.LLILLL);
    }

    public C0F6N(VideoPublishEditModel videoPublishEditModel, C0E48 c0e48, String str, String str2, C0F6L c0f6l) {
        this.LL = videoPublishEditModel;
        this.LLILLJJLI = c0e48;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = c0f6l;
    }
}
