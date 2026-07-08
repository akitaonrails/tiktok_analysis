package X;

import Y.ACListenerS163S0100000_29;
import Y.ACListenerS173S0000000_29;
import Y.AComparatorS48S0000000_29;
import Y.ALAdapterS24S0100000_29;
import Y.ALAdapterS3S0200000_6;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.text.InputFilter;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.live.livehostimpl.edit.text.bean.InteractTextStructWrap;
import com.ss.android.ugc.aweme.live.livehostimpl.edit.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.live.livehostimpl.edit.text.bean.TextStickerString;
import com.ss.android.ugc.aweme.live.livehostimpl.edit.text.bean.TextStickerTextPair;
import com.ss.android.ugc.aweme.live.livehostimpl.edit.text.bean.TextStickerTextUnderlineIndexRange;
import com.ss.android.ugc.aweme.live.livehostimpl.edit.text.bean.TextStickerTextWrap;
import com.ss.android.ugc.aweme.live.livehostimpl.edit.text.font.TextFontStyleData;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import com.ss.android.ugc.bytebench.EditorStickerDowngradeServiceImpl;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: X.125C, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public class C125C extends FrameLayout {
    public static final /* synthetic */ int LLJJJJJIL = 0;
    public final Context LL;
    public View LLILLJJLI;
    public AnonymousClass1255 LLILLL;
    public C125D LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public int LLIZ;
    public int LLIZLLLIL;
    public boolean LLJ;
    public final InputMethodManager LLJI;
    public View LLJIJIL;
    public View LLJILJIL;
    public View LLJILJILJ;
    public C196990125k LLJILLL;
    public View LLJJ;
    public View LLJJI;
    public View LLJJIII;
    public final boolean LLJJIJI;
    public boolean LLJJIJIIJIL;
    public final ALAdapterS24S0100000_29 LLJJIJIL;
    public List<InteractTextStructWrap> LLJJJ;
    public long LLJJJIL;
    public C125J LLJJJJ;

    public Point getEditInputScreenCenterPoint() {
        int[] iArr = new int[2];
        this.LLJILJILJ.getLocationOnScreen(iArr);
        Point point = new Point(this.LLJILJILJ.getWidth() / 2, this.LLJILJILJ.getHeight() / 2);
        return new Point(iArr[0] + point.x, iArr[1] + point.y);
    }

    public int getLayoutRes() {
        return R.layout.djo;
    }

    public int getScene() {
        return 0;
    }

    public C125L getVisibleController() {
        return null;
    }

    public void setBgColorChangeListener(C125M c125m) {
    }

    public void setEffectText(List<TextStickerTextWrap> list) {
    }

    public void setInputLayoutShowListener(C125N c125n) {
    }

    public void setTextStickerView(C125R c125r) {
    }

    public void setVisibleController(C125L c125l) {
    }

    private int getEditTextLength() {
        if (C2204961BRm.LLZZZZ(this.LLILLL, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOahdZqA0DsPdiyW4HErLsm6UD8n4bHwAom1oFIf0L5Un2ObuK4AgDMoliniyrWdqmDj", null)) != null) {
            return C2204961BRm.LLZZZZ(this.LLILLL, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOahdZqA0DsPdiyW4HErLsm6UD8n4bHwAom1oFIf0L5Un2ObuK4AgDMoliniyrWdqmDj", null)).length();
        }
        return 0;
    }

    public final void LIZ() {
        if (this.LLJ) {
            return;
        }
        if (EditorStickerDowngradeServiceImpl.LIZIZ().LIZ()) {
            int visibility = getVisibility();
            setVisibility(8);
            C1602160rnK.LIZIZ(visibility, 8, this);
        } else if (getVisibility() != 8) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "alpha", 0.0f, 0.0f);
            objectAnimatorOfFloat.setDuration(300L);
            objectAnimatorOfFloat.addListener(new ALAdapterS3S0200000_6(this, 5));
            C786410Ut5.Pd(objectAnimatorOfFloat);
        }
        this.LLJ = true;
    }

    public final void LIZIZ() {
        InputMethodManager inputMethodManager;
        AnonymousClass1255 anonymousClass1255 = this.LLILLL;
        if (anonymousClass1255 == null || (inputMethodManager = this.LLJI) == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(anonymousClass1255.getWindowToken(), 0);
    }

    public final void LIZJ() {
        C2241008qG c2241008qG = new C2241008qG();
        c2241008qG.LIZJ(Long.valueOf(System.currentTimeMillis() - this.LLJJJIL), "click_show_duration");
        c2241008qG.LJ();
        if (EditorStickerDowngradeServiceImpl.LIZIZ().LIZ()) {
            int visibility = getVisibility();
            setVisibility(0);
            C1602160rnK.LIZIZ(visibility, 0, this);
        } else {
            final ALAdapterS24S0100000_29 aLAdapterS24S0100000_29 = this.LLJJIJIL;
            final long j = this.LLJJJIL;
            C786410Ut5.LJLLLLLL(0, this);
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "alpha", 0.0f, 1.0f);
            objectAnimatorOfFloat.setDuration(300L);
            objectAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: X.0c00
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    C786410Ut5.LJLLLLLL(0, this);
                    if (j > 0) {
                        C2241008qG c2241008qG2 = new C2241008qG();
                        c2241008qG2.LIZJ(Long.valueOf(System.currentTimeMillis() - j), "click_show_duration");
                        c2241008qG2.LJ();
                    }
                    Animator.AnimatorListener animatorListener = aLAdapterS24S0100000_29;
                    if (animatorListener != null) {
                        animatorListener.onAnimationEnd(animator);
                    }
                    super.onAnimationEnd(animator);
                }
            });
            C786410Ut5.Pd(objectAnimatorOfFloat);
        }
        if (C2401009ay.LIZ(C196986125g.LJFF().LJ())) {
            C1233040iBy c1233040iBy = new C1233040iBy(getContext());
            c1233040iBy.LIZIZ(2131830071);
            c1233040iBy.LIZLLL();
        }
        this.LLJ = false;
    }

    public Point getEditInputCenterPoint() {
        return new Point(C0JAI.LIZJ(this.LL) / 2, ((int) C0JAI.LIZ(52.0f, this.LL)) + (this.LLJILJILJ.getHeight() / 2));
    }

    public Point getEditPageSize() {
        return new Point(getWidth(), getHeight());
    }

    public String getEditTextStr() {
        return C2204961BRm.LLZZZZ(this.LLILLL, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOahdZqA0DsPdiyW4HErLsm6UD8n4bHwAom1oFIf0L5Un2ObuK4AgDMoliniyrWdqmDj", null)) != null ? C2204961BRm.LLZZZZ(this.LLILLL, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOahdZqA0DsPdiyW4HErLsm6UD8n4bHwAom1oFIf0L5Un2ObuK4AgDMoliniyrWdqmDj", null)).toString() : "";
    }

    public TextStickerTextWrap getTextWrap() {
        AnonymousClass1255 anonymousClass1255 = this.LLILLL;
        List<InteractTextStructWrap> list = this.LLJJJ;
        if (anonymousClass1255 == null) {
            HashMap map = new HashMap();
            TextStickerTextPair textStickerTextPair = new TextStickerTextPair("", new ArrayList());
            return new TextStickerTextWrap(map, textStickerTextPair, textStickerTextPair.first.length(), false, false);
        }
        String string = C2204961BRm.LLJILLL(anonymousClass1255, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOahdZqA0DsPdiyW4HErLsm6UD8n4bHwAIWoo1Ip0KdO4kOXo7E2hlJmJ/WJS8093bWDYaKyaH8=", null)).toString();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int lineCount = anonymousClass1255.getLineCount();
        int i = 0;
        int i2 = 0;
        while (i < lineCount) {
            int lineEnd = anonymousClass1255.getLayout().getLineEnd(i);
            TextStickerString textStickerString = new TextStickerString(string.substring(i2, lineEnd));
            ArrayList arrayList = new ArrayList();
            if (list != null) {
                for (InteractTextStructWrap interactTextStructWrap : list) {
                    if (interactTextStructWrap.getRange().getStart() < lineEnd && interactTextStructWrap.getRange().getEnd() > i2) {
                        if (i2 >= interactTextStructWrap.getRange().getStart() && lineEnd <= interactTextStructWrap.getRange().getEnd()) {
                            TextStickerTextUnderlineIndexRange textStickerTextUnderlineIndexRange = new TextStickerTextUnderlineIndexRange(i2 - i2, lineEnd - i2);
                            CreateAnchorInfo struct = interactTextStructWrap.getStruct();
                            arrayList.add(new InteractTextStructWrap(textStickerTextUnderlineIndexRange, struct.copy(struct.type, struct.keyword, struct.url, struct.language, struct.content, struct.iconUrl, struct.addTime, struct.extra, struct.thirdId, struct.time, struct.subtype, struct.canDelete, struct.display, struct.pluginInfo, struct.minisInfos, struct.isEditProp, struct.iconRawId)));
                        } else if (i2 >= interactTextStructWrap.getRange().getStart() && lineEnd > interactTextStructWrap.getRange().getEnd()) {
                            TextStickerTextUnderlineIndexRange textStickerTextUnderlineIndexRange2 = new TextStickerTextUnderlineIndexRange(i2 - i2, interactTextStructWrap.getRange().getEnd() - i2);
                            CreateAnchorInfo struct2 = interactTextStructWrap.getStruct();
                            arrayList.add(new InteractTextStructWrap(textStickerTextUnderlineIndexRange2, struct2.copy(struct2.type, struct2.keyword, struct2.url, struct2.language, struct2.content, struct2.iconUrl, struct2.addTime, struct2.extra, struct2.thirdId, struct2.time, struct2.subtype, struct2.canDelete, struct2.display, struct2.pluginInfo, struct2.minisInfos, struct2.isEditProp, struct2.iconRawId)));
                        } else if (i2 < interactTextStructWrap.getRange().getStart() && lineEnd <= interactTextStructWrap.getRange().getEnd()) {
                            TextStickerTextUnderlineIndexRange textStickerTextUnderlineIndexRange3 = new TextStickerTextUnderlineIndexRange(interactTextStructWrap.getRange().getStart() - i2, lineEnd - i2);
                            CreateAnchorInfo struct3 = interactTextStructWrap.getStruct();
                            arrayList.add(new InteractTextStructWrap(textStickerTextUnderlineIndexRange3, struct3.copy(struct3.type, struct3.keyword, struct3.url, struct3.language, struct3.content, struct3.iconUrl, struct3.addTime, struct3.extra, struct3.thirdId, struct3.time, struct3.subtype, struct3.canDelete, struct3.display, struct3.pluginInfo, struct3.minisInfos, struct3.isEditProp, struct3.iconRawId)));
                        } else if (i2 < interactTextStructWrap.getRange().getStart() && lineEnd > interactTextStructWrap.getRange().getEnd()) {
                            TextStickerTextUnderlineIndexRange textStickerTextUnderlineIndexRange4 = new TextStickerTextUnderlineIndexRange(interactTextStructWrap.getRange().getStart() - i2, interactTextStructWrap.getRange().getEnd() - i2);
                            CreateAnchorInfo struct4 = interactTextStructWrap.getStruct();
                            arrayList.add(new InteractTextStructWrap(textStickerTextUnderlineIndexRange4, struct4.copy(struct4.type, struct4.keyword, struct4.url, struct4.language, struct4.content, struct4.iconUrl, struct4.addTime, struct4.extra, struct4.thirdId, struct4.time, struct4.subtype, struct4.canDelete, struct4.display, struct4.pluginInfo, struct4.minisInfos, struct4.isEditProp, struct4.iconRawId)));
                        }
                    }
                }
            }
            if (arrayList.size() > 1) {
                C08XD.LJJ(arrayList, new AComparatorS48S0000000_29(9));
            }
            linkedHashMap.put(textStickerString, arrayList);
            anonymousClass1255.getLayout().getLineBounds(i, new Rect());
            i++;
            i2 = lineEnd;
        }
        ArrayList arrayList2 = new ArrayList();
        if (list != null) {
            for (InteractTextStructWrap interactTextStructWrap2 : list) {
                arrayList2.add(interactTextStructWrap2.copy(interactTextStructWrap2.range, interactTextStructWrap2.struct));
            }
        }
        return new TextStickerTextWrap(linkedHashMap, new TextStickerTextPair(string, arrayList2), anonymousClass1255.getSelectionStart(), anonymousClass1255.hasFocus(), false);
    }

    public List<TextStickerTextWrap> getTextWrapList() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(getTextWrap());
        return arrayList;
    }

    public int getAlignTxt() {
        return this.LLIZ;
    }

    public int getCurColor() {
        return this.LLIZLLLIL;
    }

    public int getCurTxtMode() {
        return this.LLILZIL;
    }

    public EditText getEditText() {
        return this.LLILLL;
    }

    public final void LIZLLL(int i) {
        HashMap map = new HashMap();
        TextStickerTextPair textStickerTextPair = new TextStickerTextPair("", new ArrayList());
        LJ(C1697810uHb.LJ(new TextStickerTextWrap(map, textStickerTextPair, textStickerTextPair.first.length(), false, false)), 0, -1, 0, "", true, 64);
    }

    public final void LJFF(TextFontStyleData textFontStyleData) {
        boolean z;
        if (textFontStyleData == null) {
            return;
        }
        if (textFontStyleData.enableBgColor == 1) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            if (this.LLILZLL == -1 || this.LLILZIL != 1) {
                this.LLILZLL = this.LLILZIL;
                this.LLILZIL = 1;
                return;
            }
            return;
        }
        int i = this.LLILZLL;
        if (i == -1) {
            return;
        }
        this.LLILZIL = i;
    }

    public void setCurrentClickTime(long j) {
        this.LLJJJIL = j;
    }

    public void setData(TextStickerData textStickerData) {
        int bgMode = textStickerData.getBgMode();
        int color = textStickerData.getColor();
        int align = textStickerData.getAlign();
        this.LLILZIL = bgMode;
        this.LLIZLLLIL = color;
        this.LLIZ = align;
        if (TextUtils.isEmpty(textStickerData.getFontType())) {
            C196986125g.LJFF().LJIIIIZZ(getScene(), textStickerData.getFontType());
        }
    }

    public void setTextStickerUpdateListener(C125J c125j) {
        this.LLJJJJ = c125j;
    }

    public C125C(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLILZIL = 1;
        this.LLILZLL = -1;
        this.LLIZ = 2;
        this.LLIZLLLIL = -1;
        this.LLJ = true;
        this.LLJJIJI = true;
        this.LLJJIJIL = new ALAdapterS24S0100000_29(this, 4);
        this.LLJJJ = new ArrayList();
        this.LLJJJIL = -1L;
        this.LL = context;
        this.LLJI = (InputMethodManager) C786410Ut5.H2(context, "input_method");
        View viewSd = C786410Ut5.Sd(getLayoutRes(), C786410Ut5.ne(context), null);
        this.LLILLJJLI = viewSd;
        this.LLJILJIL = viewSd.findViewById(R.id.eug);
        this.LLJILJILJ = this.LLILLJJLI.findViewById(R.id.krx);
        this.LLILLL = (AnonymousClass1255) this.LLILLJJLI.findViewById(R.id.hd7);
        ViewGroup viewGroup = (ViewGroup) this.LLILLJJLI.findViewById(R.id.ih4);
        C196990125k c196990125k = new C196990125k(context, getScene());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c196990125k);
        c196990125k.setLayoutParams(layoutParams);
        this.LLJILLL = c196990125k;
        c196990125k.LIZIZ(C196986125g.LJFF().LJ());
        viewGroup.addView(this.LLJILLL);
        C125D c125d = (C125D) this.LLILLJJLI.findViewById(R.id.e8b);
        this.LLILZ = c125d;
        c125d.setColorChangeListener(new C125H(this));
        this.LLJILLL.setClickFontStyleListener(new InterfaceC196995125p() { // from class: X.125E
            @Override // X.InterfaceC196995125p
            public final void LIZ(TextFontStyleData textFontStyleData) {
                C125C c125c = this.LIZ;
                if (textFontStyleData == null) {
                    c125c.getClass();
                    return;
                }
                c125c.LJFF(textFontStyleData);
                C196986125g.LJFF().LJIIIIZZ(c125c.getScene(), textFontStyleData.fileName);
                c125c.LLILLL.setFontType(C196986125g.LJFF().LIZIZ(c125c.getScene()));
                c125c.LLILLL.LJIIIIZZ(c125c.LLILZIL, c125c.LLIZLLLIL);
                if (c125c.getScene() != 0) {
                    return;
                }
                int i = textFontStyleData.fontSize;
                if (i > 0) {
                    c125c.LLILLL.setFontSize(i);
                } else {
                    c125c.LLILLL.setFontSize(64);
                }
            }
        });
        this.LLILLJJLI.findViewById(R.id.nir);
        View viewFindViewById = this.LLILLJJLI.findViewById(R.id.tv_sure);
        this.LLJIJIL = viewFindViewById;
        C786410Ut5.I7(new ACListenerS163S0100000_29(this, 6), viewFindViewById);
        C786410Ut5.I7(new ACListenerS163S0100000_29(this, 7), this.LLILLJJLI);
        addView(this.LLILLJJLI);
        C786410Ut5.I7(new ACListenerS173S0000000_29(0), findViewById(R.id.pm1));
        this.LLJJI = this.LLILLJJLI.findViewById(R.id.bws);
        this.LLJJ = this.LLILLJJLI.findViewById(R.id.bwr);
        View viewFindViewById2 = this.LLILLJJLI.findViewById(R.id.ul9);
        this.LLJJIII = viewFindViewById2;
        C786410Ut5.LJLLLLLL(8, viewFindViewById2);
        this.LLJJI.setBackground(C426580Go4.LIZJ(-1, 16777215, (int) C0JAI.LIZ(2.0f, getContext()), (int) C0JAI.LIZ(4.0f, getContext())));
        this.LLJJ.setBackground(C426580Go4.LIZIZ(C125F.LIZIZ().LIZ().LIZ));
        C786410Ut5.I7(new ACListenerS163S0100000_29(this, 8), this.LLJJIII);
        AnonymousClass1250.LIZJ(this.LLJJIII);
        AnonymousClass1250.LIZIZ(this.LLJIJIL);
        this.LLILLL.setFilters(new InputFilter[]{new InputFilter.LengthFilter(36)});
    }

    public final void LJ(List list, int i, int i2, int i3, String str, boolean z, int i4) {
        List<InteractTextStructWrap> arrayList;
        InputMethodManager inputMethodManager;
        int i5;
        this.LLILZLL = -1;
        C196990125k c196990125k = this.LLJILLL;
        if (c196990125k != null) {
            c196990125k.LIZIZ(C196986125g.LJFF().LJ());
        }
        AnonymousClass1255 anonymousClass1255 = this.LLILLL;
        if (anonymousClass1255 != null) {
            anonymousClass1255.setFocusable(true);
            anonymousClass1255.setFocusableInTouchMode(true);
            anonymousClass1255.requestFocus();
            anonymousClass1255.setCursorVisible(true);
        }
        this.LLILLL.setTextSize(i4);
        C125D c125d = this.LLILZ;
        c125d.LIZ();
        if (z) {
            c125d.setSelectColorView(i2);
        }
        String strLIZ = AnonymousClass1258.LIZ(list);
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list) {
                if (((TextStickerTextWrap) obj).isValid()) {
                    arrayList2.add(obj);
                }
            }
            if (!arrayList2.isEmpty()) {
                if (arrayList2.size() == 1) {
                    arrayList = ((TextStickerTextWrap) ListProtector.get(arrayList2, 0)).safeStrPair().second;
                } else {
                    int size = arrayList2.size();
                    for (int i6 = 1; i6 < size; i6++) {
                        for (InteractTextStructWrap interactTextStructWrap : ((TextStickerTextWrap) ListProtector.get(arrayList2, i6)).safeStrPair().second) {
                            interactTextStructWrap.getRange().getStart();
                            interactTextStructWrap.getRange().getEnd();
                        }
                    }
                    arrayList = new ArrayList<>();
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        C19719612Di.LJJI(((TextStickerTextWrap) it2.next()).safeStrPair().second, arrayList);
                    }
                }
            } else {
                arrayList = new ArrayList<>();
            }
        } else {
            arrayList = new ArrayList<>();
        }
        this.LLJJJ = arrayList;
        this.LLILLL.setTextStructWrapList(arrayList);
        if (z) {
            C196986125g.LJFF().LJIIIZ(getScene());
            this.LLJILLL.LIZJ();
            this.LLILZIL = 1;
            this.LLILZLL = -1;
            int i7 = C125F.LIZIZ().LIZ().LIZIZ;
            this.LLIZLLLIL = i7;
            this.LLIZ = 2;
            this.LLILLL.LJIIIIZZ(this.LLILZIL, i7);
            this.LLILLL.LJIIIZ(0, "");
            if (getScene() == 0) {
                C196986125g c196986125gLJFF = C196986125g.LJFF();
                TextFontStyleData textFontStyleData = c196986125gLJFF.LIZ.get(c196986125gLJFF.LIZJ);
                if (textFontStyleData != null && (i5 = textFontStyleData.fontSize) > 0) {
                    this.LLILLL.setFontSize(i5);
                }
            }
        } else {
            this.LLILLL.LJIIIZ(strLIZ.length(), strLIZ);
            this.LLILZ.setSelectColorView(i2);
            this.LLILZIL = i;
            this.LLIZ = i3;
            this.LLIZLLLIL = i2;
            C196986125g.LJFF().LJIIIIZZ(getScene(), str);
        }
        this.LLILLL.setFontType(C196986125g.LJFF().LIZIZ(getScene()));
        this.LLILLL.LJIIIIZZ(i, i2);
        this.LLILLL.setAligin(this.LLIZ);
        this.LLJILLL.LIZJ();
        LJFF(C196986125g.LJFF().LIZJ(getScene()));
        if (!this.LLJJIJI) {
            this.LLJJ.setBackground(C426580Go4.LIZIZ(C125F.LIZIZ().LIZ().LIZ));
        }
        if (!this.LLJ && !z) {
            return;
        }
        this.LLJJIJIIJIL = true;
        this.LLJ = false;
        if (this.LLILLL == null || (inputMethodManager = this.LLJI) == null) {
            return;
        }
        inputMethodManager.toggleSoftInput(0, 2);
    }
}
