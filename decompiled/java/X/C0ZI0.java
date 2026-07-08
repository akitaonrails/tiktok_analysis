package X;

import Y.AComparatorS33S0000000_14;
import android.app.Activity;
import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.CharacterStyle;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.commerce.tools.mission.service.ICommerceToolsMissionService;
import com.ss.android.ugc.aweme.creative.model.publish.AVTextExtraStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.internal.AVCommerceServiceImpl;
import com.ss.android.ugc.aweme.lexical.platform.span.AdSpan;
import com.ss.android.ugc.aweme.lexical.platform.span.AiCopyWritingSpan;
import com.ss.android.ugc.aweme.lexical.platform.span.MentionSpan;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.search.ISearchService;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import lth.o;

/* JADX INFO: renamed from: X.0ZI0, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public class C0ZI0 extends C0ZIH implements InterfaceC856090XiB<AVTextExtraStruct> {
    public static final /* synthetic */ int LLLLJ = 0;
    public int LLJLLIL;
    public String LLJLLL;
    public C0GZ6 LLJZ;
    public boolean LLJZIJLIL;
    public C0GZ8 LLL;
    public int LLLF;
    public int LLLFF;
    public int LLLFFI;
    public List<InputFilter> LLLFZ;
    public C0ZID LLLI;
    public final HashSet<String> LLLII;
    public String LLLIIII;
    public String LLLIIIIL;
    public String LLLIIIL;
    public Boolean LLLIIL;
    public C0ZIB LLLIILIL;
    public boolean LLLIL;
    public C0ZID LLLILZ;
    public int LLLILZJ;
    public C0ZIF LLLILZLLLI;
    public View LLLIZZ;
    public View LLLJ;
    public C19EG LLLJIL;
    public C855530XhH LLLJL;
    public int LLLL;
    public boolean LLLLII;
    public boolean LLLLIIIILLL;
    public View.OnFocusChangeListener LLLLIIL;
    public final InputFilter LLLLIILL;
    public boolean LLLLIILLL;
    public boolean LLLLIL;
    public int LLLLILI;

    public static boolean LJJIJLIJ(int i) {
        return i == 18;
    }

    public void setChainString(String str) {
    }

    @Override // X.InterfaceC856090XiB
    public final C857470XkP LIZ() {
        return new C857470XkP(this);
    }

    @Override // X.InterfaceC856090XiB
    public final C856400Xig LIZIZ() {
        return new C856400Xig(this);
    }

    public final void LJJIIZ() {
        if (this.LLJZIJLIL) {
            return;
        }
        if (getVideoType() == 1) {
            C0LAB c0lab = new C0LAB();
            c0lab.LJ("creation_id", this.LLJLLL);
            c0lab.LJ("caption_type", "duet");
            C20684815ws.LJIILLIIL("caption_delete", c0lab.LIZ);
        } else if (getVideoType() == 2) {
            C0LAB c0lab2 = new C0LAB();
            c0lab2.LJ("creation_id", this.LLJLLL);
            c0lab2.LJ("caption_type", "react");
            C20684815ws.LJIILLIIL("caption_delete", c0lab2.LIZ);
        } else if (getVideoType() == 3) {
            C0LAB c0lab3 = new C0LAB();
            c0lab3.LJ("creation_id", this.LLJLLL);
            c0lab3.LJ("caption_type", "comment_reply");
            C20684815ws.LJIILLIIL("caption_delete", c0lab3.LIZ);
        }
        this.LLJZIJLIL = true;
    }

    public final Editable LJJIIZI() throws Throwable {
        Editable editableP = C2204961BRm.p(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhisvAnsI1COnw46mruPGkfmgoDo5gyOdr+Qoa", null));
        Editable editableLJJIIJZLJL = LJJIIJZLJL(editableP);
        if (TextUtils.isEmpty(editableLJJIIJZLJL)) {
            return editableP;
        }
        AiCopyWritingSpan[] aiCopyWritingSpanArrLJIILLIIL = LJIILLIIL(editableLJJIIJZLJL);
        ArrayList arrayList = new ArrayList();
        if (aiCopyWritingSpanArrLJIILLIIL == null) {
            return editableP;
        }
        for (int i = 0; i < aiCopyWritingSpanArrLJIILLIIL.length; i++) {
            AiCopyWritingSpan aiCopyWritingSpan = aiCopyWritingSpanArrLJIILLIIL[i];
            if (aiCopyWritingSpan.subType == 521) {
                SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) editableLJJIIJZLJL;
                int i2 = i + 1;
                arrayList.add(new int[]{spannableStringBuilder.getSpanStart(aiCopyWritingSpan), spannableStringBuilder.getSpanEnd(aiCopyWritingSpan), i2 < aiCopyWritingSpanArrLJIILLIIL.length ? spannableStringBuilder.getSpanStart(aiCopyWritingSpanArrLJIILLIIL[i2]) : spannableStringBuilder.length()});
            }
        }
        synchronized (this) {
            try {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    int[] iArr = (int[]) arrayList.get(size);
                    SpannableStringBuilder spannableStringBuilder2 = (SpannableStringBuilder) editableLJJIIJZLJL;
                    spannableStringBuilder2.replace(iArr[0], iArr[2], (CharSequence) spannableStringBuilder2.subSequence(iArr[0], iArr[2]).toString().substring(iArr[1] - iArr[0]).replaceFirst("^[\\s\\n\\r]+", ""));
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return editableLJJIIJZLJL;
    }

    public final void LJJJJJL() {
        List<InputFilter> list;
        if (this.LLLIL) {
            this.LLLIL = false;
            C0ZIB c0zib = this.LLLIILIL;
            if (c0zib != null && ((list = this.LLLFZ) == null || !((ArrayList) list).contains(c0zib))) {
                LJJIIJ(this.LLLIILIL);
            }
            C0ZID c0zid = this.LLLILZ;
            if (c0zid != null) {
                this.LLLI = c0zid;
                this.LLLILZ = null;
            }
        }
    }

    public final void LJJJJLL() {
        if (this.LLLIL) {
            return;
        }
        this.LLLIL = true;
        C0ZIB c0zib = this.LLLIILIL;
        if (c0zib != null) {
            LJJJJI(c0zib);
        }
        this.LLLILZ = this.LLLI;
        this.LLLI = null;
    }

    public List<TextExtraStruct> getAiTextStructs() throws Throwable {
        Editable editableP = C2204961BRm.p(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhisvAnsI1COnw46mruPGkfmgoDo5gyOdr+Qoa", null));
        if (editableP == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        C0ZI8[] c0zi8Arr = (C0ZI8[]) editableP.getSpans(0, editableP.length(), C0ZI8.class);
        int length = c0zi8Arr.length;
        int[] iArr = new int[length];
        if (c0zi8Arr.length > 0) {
            for (int i = 0; i < length; i++) {
                iArr[i] = editableP.getSpanStart(c0zi8Arr[i]);
            }
            Arrays.sort(iArr);
        }
        AiCopyWritingSpan[] aiCopyWritingSpanArrLJIILLIIL = LJIILLIIL(editableP);
        if (aiCopyWritingSpanArrLJIILLIIL != null) {
            for (AiCopyWritingSpan aiCopyWritingSpan : aiCopyWritingSpanArrLJIILLIIL) {
                int spanStart = editableP.getSpanStart(aiCopyWritingSpan);
                int i2 = 0;
                for (int i3 = 0; i3 < length; i3++) {
                    if (spanStart > iArr[i3]) {
                        i2++;
                    }
                }
                aiCopyWritingSpan.mStruct.setStart(editableP.getSpanStart(aiCopyWritingSpan) - i2);
                aiCopyWritingSpan.mStruct.setEnd(editableP.getSpanEnd(aiCopyWritingSpan) - i2);
                aiCopyWritingSpan.mStruct.setHashTagName(aiCopyWritingSpan.mText);
                arrayList.add(aiCopyWritingSpan.mStruct);
            }
        }
        return arrayList;
    }

    @Override // X.C0ZIH
    public List<TextExtraStruct> getCompatTextExtraStructList() throws Throwable {
        Editable editableP = C2204961BRm.p(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhisvAnsI1COnw46mruPGkfmgoDo5gyOdr+Qoa", null));
        if (editableP == null || TextUtils.isEmpty(editableP.toString())) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (MentionSpan mentionSpan : LJIJ(editableP)) {
            int i = mentionSpan.mType;
            if (i == 0 || i == 5) {
                mentionSpan.mStruct.setStart(editableP.getSpanStart(mentionSpan));
                mentionSpan.mStruct.setEnd(editableP.getSpanEnd(mentionSpan));
                arrayList.add(mentionSpan.mStruct);
            }
        }
        for (C857030Xjh c857030Xjh : (ArrayList) LJJIJL(getNoAdTagText())) {
            TextExtraStruct textExtraStruct = new TextExtraStruct();
            textExtraStruct.setType(1);
            textExtraStruct.setHashTagName(c857030Xjh.LIZJ.replaceAll("#", ""));
            textExtraStruct.setStart(c857030Xjh.LIZ);
            textExtraStruct.setEnd(c857030Xjh.LIZIZ);
            arrayList.add(textExtraStruct);
            LJJJJL(null, textExtraStruct.getHashTagName());
        }
        return arrayList;
    }

    public int getCurAdTagStart() {
        int length = this.LLLIIIL.length();
        if (C2204961BRm.p(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhisvAnsI1COnw46mruPGkfmgoDo5gyOdr+Qoa", null)) != null) {
            return Math.max(C2204961BRm.p(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhisvAnsI1COnw46mruPGkfmgoDo5gyOdr+Qoa", null)).length() - length, 0);
        }
        return -1;
    }

    @Override // X.C0ZIH
    public String getNoAdTagText() {
        return C2204961BRm.p(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhisvAnsI1COnw46mruPGkfmgoDo5gyOdr+Qoa", null)) == null ? "" : TextUtils.isEmpty(this.LLLIIIL) ? C2204961BRm.p(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhisvAnsI1COnw46mruPGkfmgoDo5gyOdr+Qoa", null)).toString() : C2204961BRm.p(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhisvAnsI1COnw46mruPGkfmgoDo5gyOdr+Qoa", null)).toString().substring(0, getCurAdTagStart());
    }

    public int getTotalHashtagCount() {
        if (C2204961BRm.p(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhisvAnsI1COnw46mruPGkfmgoDo5gyOdr+Qoa", null)) == null) {
            return 0;
        }
        int size = getValidNoAdTagHashTagList().size();
        return TextUtils.isEmpty(this.LLLIIIL) ^ true ? size + 1 : size;
    }

    @Override // X.C0ZIH, com.ss.android.ugc.aweme.services.publish.IAVMentionEditText
    public final void removeHashTag() {
        if (TextUtils.isEmpty(this.LLLIIIL)) {
            return;
        }
        LJJJJI(this.LLLLIILL);
        this.LLLIIL = Boolean.FALSE;
        int curAdTagStart = getCurAdTagStart();
        this.LLLIIIL = "";
        if (C2204961BRm.p(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhisvAnsI1COnw46mruPGkfmgoDo5gyOdr+Qoa", null)) != null) {
            C2204961BRm.p(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhisvAnsI1COnw46mruPGkfmgoDo5gyOdr+Qoa", null)).replace(curAdTagStart, C2204961BRm.p(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhisvAnsI1COnw46mruPGkfmgoDo5gyOdr+Qoa", null)).length(), "");
        }
    }

    @Override // X.InterfaceC856090XiB
    public Activity getAndroidContext() {
        Activity activityLIZ = C0FNT.LIZ(getContext());
        Objects.requireNonNull(activityLIZ);
        return activityLIZ;
    }

    @Override // android.widget.TextView
    public int getMaxWidth() {
        return super.getMaxWidth();
    }

    public int getPureHashtagLength() {
        Iterator it2 = ((ArrayList) LJJIJL(getNoAdTagText())).iterator();
        int length = 0;
        while (it2.hasNext()) {
            length += ((C857030Xjh) it2.next()).LIZJ.length();
        }
        return length;
    }

    public List<C857030Xjh> getValidNoAdTagHashTagList() {
        return LJJIJL(getNoAdTagText());
    }

    @Override // X.C0ZIH
    public String getAdTag() {
        return this.LLLIIIL;
    }

    public int getHookAtMaxWidth() {
        return this.LLLFF;
    }

    public int getSelectionStartForTest() {
        return this.LLLLILI;
    }

    public int getVideoType() {
        return this.LLLFFI;
    }

    @Override // X.InterfaceC856090XiB
    public int getWidthLimit() {
        return this.LLLFF;
    }

    public C0ZI0(Context context) {
        String string;
        super(context);
        this.LLJLLL = "";
        this.LLLII = new HashSet<>();
        this.LLLIIII = "";
        if (getHint() == null) {
            string = "";
        } else {
            string = getHint().toString();
        }
        this.LLLIIIIL = string;
        this.LLLIIIL = "";
        this.LLLIIL = Boolean.FALSE;
        this.LLLIILIL = null;
        this.LLLIL = false;
        this.LLLILZ = null;
        this.LLLILZJ = 0;
        this.LLLILZLLLI = null;
        this.LLLIZZ = null;
        this.LLLJ = null;
        this.LLLJIL = null;
        this.LLLJL = null;
        this.LLLLII = true;
        this.LLLLIIIILLL = false;
        View.OnFocusChangeListener onFocusChangeListener = new View.OnFocusChangeListener() { // from class: X.0ZI2
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                View.OnFocusChangeListener onFocusChangeListener2 = this.LL.LLLLIIL;
                if (onFocusChangeListener2 != null) {
                    onFocusChangeListener2.onFocusChange(view, z);
                }
                if (z) {
                    if (!TextUtils.isEmpty(this.LL.LLLIIII)) {
                        C0ZI0 c0zi0 = this.LL;
                        c0zi0.addHashTag(c0zi0.LLLIIII);
                        C0ZI0 c0zi02 = this.LL;
                        c0zi02.setHint(c0zi02.LLLIIIIL);
                        this.LL.LLLIIII = "";
                        return;
                    }
                    return;
                }
                if (!TextUtils.isEmpty(this.LL.getNoAdTagText())) {
                    return;
                }
                C0ZI0 c0zi03 = this.LL;
                c0zi03.LLLIIII = c0zi03.getAdTag();
                this.LL.removeHashTag();
                C0ZI0 c0zi04 = this.LL;
                c0zi04.LLLIIIIL = c0zi04.getHint().toString();
                C0ZI0 c0zi05 = this.LL;
                c0zi05.setHint(TextUtils.concat(c0zi05.getHint(), this.LL.LLLIIII));
            }
        };
        this.LLLLIILL = new InputFilter() { // from class: X.0ZI4
            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
                return C0ZI0.LJJIII(this.LL, charSequence, spanned, i3, i4);
            }
        };
        this.LLLLIILLL = false;
        this.LLLLIL = false;
        this.LLLLILI = 0;
        addTextChangedListener(new C0ZI1(this));
        setOnFocusChangeListener(onFocusChangeListener);
    }

    public static String LJJIJIIJIL(Editable editable) {
        if (editable == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder(editable.toString());
        C0ZI8[] c0zi8Arr = (C0ZI8[]) editable.getSpans(0, editable.length(), C0ZI8.class);
        if (c0zi8Arr.length > 0) {
            int length = c0zi8Arr.length;
            int[] iArr = new int[length];
            for (int i = 0; i < length; i++) {
                iArr[i] = editable.getSpanStart(c0zi8Arr[i]);
            }
            Arrays.sort(iArr);
            while (true) {
                length--;
                if (length < 0) {
                    break;
                }
                int i2 = iArr[length];
                sb.delete(i2, i2 + 1);
            }
        }
        return sb.toString();
    }

    @Override // X.C0ZIH
    public final String LJIJI(Editable editable) {
        if (editable == null) {
            return "";
        }
        if (TextUtils.isEmpty(this.LLLIIIL)) {
            return editable.toString();
        }
        return editable.toString().substring(0, Math.max(editable.length() - this.LLLIIIL.length(), 0));
    }

    public final void LJJIIJ(InputFilter inputFilter) {
        if (this.LLLFZ == null) {
            this.LLLFZ = new ArrayList();
        }
        this.LLLFZ.add(inputFilter);
        setFilters((InputFilter[]) this.LLLFZ.toArray(new InputFilter[0]));
    }

    public final Editable LJJIIJZLJL(Editable editable) {
        if (editable == null) {
            return null;
        }
        synchronized (this) {
            try {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(editable.toString());
                Object[] spans = editable.getSpans(0, editable.length(), Object.class);
                if (spans == null) {
                    return null;
                }
                for (Object underlying : spans) {
                    int spanStart = editable.getSpanStart(underlying);
                    if (spanStart >= 0) {
                        int spanEnd = editable.getSpanEnd(underlying);
                        int spanFlags = editable.getSpanFlags(underlying);
                        if (!(underlying instanceof TextWatcher)) {
                            if (underlying instanceof CharacterStyle) {
                                underlying = ((CharacterStyle) underlying).getUnderlying();
                            }
                            spannableStringBuilder.setSpan(underlying, spanStart, spanEnd, spanFlags);
                        }
                    }
                }
                return spannableStringBuilder;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final List<C857030Xjh> LJJIJ(String str) {
        int iIndexOf;
        String strGroup;
        boolean z;
        if (((ISearchService) ServiceManager.get().getService(ISearchService.class)).LLZLI().disableHashtagSearch) {
            return new ArrayList();
        }
        HashSet hashSet = new HashSet();
        int length = 0;
        for (String str2 : C856940XjY.LIZLLL(str)) {
            int iIndexOf2 = str.indexOf(str2, length);
            if (iIndexOf2 >= 0) {
                Iterator it2 = ((HashSet) this.LLJLILLLLZIIL).iterator();
                while (true) {
                    if (it2.hasNext()) {
                        String str3 = (String) it2.next();
                        if (iIndexOf2 == str.indexOf(str3, length) && str3.length() >= str2.length()) {
                            z = true;
                            break;
                        }
                    } else {
                        z = false;
                        break;
                    }
                }
                length = str2.length() + iIndexOf2;
                if (!z) {
                    hashSet.add(new C857030Xjh(str2, iIndexOf2, length));
                }
            }
        }
        for (String str4 : (HashSet) this.LLJLILLLLZIIL) {
            int length2 = 0;
            while (length2 < str.length() && (iIndexOf = str.indexOf(str4, length2)) >= 0) {
                Matcher matcher = PatternProtector.compile(C856940XjY.LJ()).matcher(str.substring(iIndexOf));
                if (matcher.find()) {
                    strGroup = matcher.group();
                } else {
                    strGroup = "";
                }
                if (strGroup.length() > str4.length()) {
                    length2 = iIndexOf + strGroup.length();
                } else {
                    int length3 = str4.length() + iIndexOf;
                    hashSet.add(new C857030Xjh(str4, iIndexOf, length3));
                    length2 = length3;
                }
            }
        }
        ArrayList arrayList = new ArrayList(hashSet);
        Collections.sort(arrayList, new Comparator<C857030Xjh>() { // from class: X.0XmU
            @Override // java.util.Comparator
            public final int compare(C857030Xjh c857030Xjh, C857030Xjh c857030Xjh2) {
                int i = c857030Xjh.LIZ;
                int i2 = c857030Xjh2.LIZ;
                if (i == i2) {
                    return 0;
                }
                if (i < i2) {
                    return -1;
                }
                return 1;
            }
        });
        return arrayList;
    }

    public final String LJJIJIIJI(boolean z) {
        if (!TextUtils.isEmpty(this.LLLIIIL)) {
            removeHashTag();
        }
        if (z) {
            return LJJIJIIJIL(LJJIIZI());
        }
        return LJJIJIIJIL(C2204961BRm.p(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhisvAnsI1COnw46mruPGkfmgoDo5gyOdr+Qoa", null)));
    }

    public final List<C857030Xjh> LJJIJL(String str) {
        List<C857030Xjh> listLJJIJ = LJJIJ(str);
        Iterator it2 = ((ArrayList) listLJJIJ).iterator();
        while (it2.hasNext()) {
            C857030Xjh c857030Xjh = (C857030Xjh) it2.next();
            MentionSpan[] mentionSpanArr = (MentionSpan[]) C2204961BRm.p(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhisvAnsI1COnw46mruPGkfmgoDo5gyOdr+Qoa", null)).getSpans(c857030Xjh.LIZ, c857030Xjh.LIZIZ, MentionSpan.class);
            if (mentionSpanArr != null) {
                int length = mentionSpanArr.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        TextExtraStruct textExtraStruct = mentionSpanArr[i].mStruct;
                        if (textExtraStruct != null && textExtraStruct.getType() != 1) {
                            it2.remove();
                            break;
                        }
                        i++;
                    } else {
                        break;
                    }
                }
            }
        }
        return listLJJIJ;
    }

    public final void LJJIL(int i) {
        if (LJJIJLIJ(18)) {
            setAigcPrefillPrefixEndExclusive(i);
        }
    }

    public final void LJJJ(Editable editable) {
        MentionSpan[] mentionSpanArrLJIJ;
        if (this.LLLILZJ <= 0 || editable == null || (mentionSpanArrLJIJ = LJIJ(editable)) == null) {
            return;
        }
        for (MentionSpan mentionSpan : mentionSpanArrLJIJ) {
            if (mentionSpan != null) {
                int spanStart = editable.getSpanStart(mentionSpan);
                int spanEnd = editable.getSpanEnd(mentionSpan);
                if (spanStart >= 0 && spanEnd > spanStart && spanEnd <= this.LLLILZJ) {
                    mentionSpan.LIZ(18);
                }
            }
        }
    }

    public final void LJJJI(boolean z) throws Throwable {
        int i;
        if (C2204961BRm.p(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhisvAnsI1COnw46mruPGkfmgoDo5gyOdr+Qoa", null)) == null) {
            return;
        }
        System.currentTimeMillis();
        LJJIFFI();
        ArrayList<C0ZI7> arrayList = new ArrayList();
        String noAdTagText = getNoAdTagText();
        for (C857030Xjh c857030Xjh : (ArrayList) LJJIJL(noAdTagText)) {
            arrayList.add(new C0ZI7(c857030Xjh.LIZ, c857030Xjh.LIZIZ));
        }
        ArrayList<C0ZI7> arrayList2 = new ArrayList(arrayList);
        List<C0ZI7> list = this.LLJILJIL;
        if (list != null && !((ArrayList) list).isEmpty()) {
            for (C0ZI7 c0zi7 : (ArrayList) this.LLJILJIL) {
                if (c0zi7.LIZ) {
                    arrayList2.add(c0zi7);
                }
            }
        }
        Collections.sort(arrayList2, new AComparatorS33S0000000_14(32));
        if (C2204961BRm.p(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhisvAnsI1COnw46mruPGkfmgoDo5gyOdr+Qoa", null)) != null) {
            for (StyleSpan styleSpan : (StyleSpan[]) C2204961BRm.p(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhisvAnsI1COnw46mruPGkfmgoDo5gyOdr+Qoa", null)).getSpans(0, C2204961BRm.p(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhisvAnsI1COnw46mruPGkfmgoDo5gyOdr+Qoa", null)).length(), StyleSpan.class)) {
                if (styleSpan.getStyle() == 1) {
                    C2204961BRm.p(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhisvAnsI1COnw46mruPGkfmgoDo5gyOdr+Qoa", null)).removeSpan(styleSpan);
                }
            }
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        for (C0ZI7 c0zi72 : arrayList) {
            if (!z && !c0zi72.LIZ(getSelectionStart() - 1, getSelectionEnd() - 1) && !c0zi72.LIZ(getSelectionStart() + 1, getSelectionEnd() + 1)) {
                int i2 = c0zi72.LIZIZ;
                int i3 = c0zi72.LIZJ;
                int i4 = this.LLLILZJ;
                if (i4 <= 0 || i2 < 0 || i3 <= i2 || i3 > i4) {
                }
            }
            spannableStringBuilder.append((CharSequence) noAdTagText.substring(c0zi72.LIZIZ, c0zi72.LIZJ));
            int iLJJIZ = LJJIZ(c0zi72.LIZIZ, c0zi72.LIZJ, C2204961BRm.p(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhisvAnsI1COnw46mruPGkfmgoDo5gyOdr+Qoa", null)));
            MentionSpan mentionSpan = new MentionSpan(spannableStringBuilder.toString(), this.LLIZLLLIL, 0L, "", "", 1, "");
            LJJJJIZL(c0zi72.LIZIZ, c0zi72.LIZJ);
            if (LJJIJLIJ(iLJJIZ)) {
                mentionSpan.LIZ(iLJJIZ);
            }
            C2204961BRm.p(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhisvAnsI1COnw46mruPGkfmgoDo5gyOdr+Qoa", null)).setSpan(mentionSpan, c0zi72.LIZIZ, c0zi72.LIZJ, 33);
            C2204961BRm.p(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhisvAnsI1COnw46mruPGkfmgoDo5gyOdr+Qoa", null)).setSpan(new StyleSpan(1), c0zi72.LIZIZ, c0zi72.LIZJ, 33);
            spannableStringBuilder.clear();
        }
        int length = noAdTagText.length();
        int i5 = 0;
        for (C0ZI7 c0zi73 : arrayList2) {
            if (i5 >= 0 && (i = c0zi73.LIZIZ) <= length && i5 <= i) {
                if (i5 < i) {
                    int i6 = this.LLLILZJ;
                    if (i6 <= 0) {
                        LJJJJIZL(i5, i);
                    } else if (i > i6) {
                        if (i5 < i6) {
                            i5 = i6;
                        }
                        if (i5 < i) {
                            LJJJJIZL(i5, i);
                        }
                    }
                }
                C2204961BRm.p(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhisvAnsI1COnw46mruPGkfmgoDo5gyOdr+Qoa", null)).setSpan(new StyleSpan(1), c0zi73.LIZIZ, c0zi73.LIZJ, 33);
                i5 = c0zi73.LIZJ;
            }
        }
        if (i5 <= length && i5 < length) {
            int i7 = this.LLLILZJ;
            if (i7 <= 0) {
                LJJJJIZL(i5, length);
            } else if (length > i7) {
                if (i5 < i7) {
                    i5 = i7;
                }
                if (i5 < length) {
                    LJJJJIZL(i5, length);
                }
            }
        }
        LJJJ(C2204961BRm.p(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhisvAnsI1COnw46mruPGkfmgoDo5gyOdr+Qoa", null)));
        Editable editableP = C2204961BRm.p(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhisvAnsI1COnw46mruPGkfmgoDo5gyOdr+Qoa", null));
        if (editableP == null || editableP.length() != 0) {
            LJJJIL(editableP);
            LJJJJ(editableP);
        }
        LJIIJJI();
        if (C2204961BRm.p(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhisvAnsI1COnw46mruPGkfmgoDo5gyOdr+Qoa", null)) == null) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("full: ");
        sbLIZ.append(z);
        sbLIZ.append("\n  text: ");
        sbLIZ.append(C2204961BRm.p(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhisvAnsI1COnw46mruPGkfmgoDo5gyOdr+Qoa", null)).toString());
        sbLIZ.append(" and se: ");
        sbLIZ.append(getSelectionEnd());
        C2344809Gs.LJFF("MentionEditText", C2188811AlT.LIZIZ(sbLIZ));
        LJIILL();
    }

    public final void LJJJIL(Editable editable) {
        if (this.LLJZ != null) {
            for (MentionSpan mentionSpan : (MentionSpan[]) editable.getSpans(0, editable.length(), MentionSpan.class)) {
                if (!TextUtils.isEmpty(mentionSpan.awemeId)) {
                    return;
                }
            }
        }
        editable.removeSpan(this.LLJZ);
        this.LLJZ = null;
        LJJIIZ();
    }

    public final void LJJJJ(Editable editable) {
        if (this.LLL != null) {
            for (MentionSpan mentionSpan : (MentionSpan[]) editable.getSpans(0, editable.length(), MentionSpan.class)) {
                if (mentionSpan.subType == 2) {
                    return;
                }
            }
        }
        editable.removeSpan(this.LLL);
        this.LLL = null;
        LJJIIZ();
    }

    public final void LJJJJI(InputFilter inputFilter) {
        List<InputFilter> list = this.LLLFZ;
        if (list == null) {
            return;
        }
        ((ArrayList) list).remove(inputFilter);
        setFilters((InputFilter[]) ((ArrayList) this.LLLFZ).toArray(new InputFilter[0]));
    }

    @Override // X.C0ZIH, com.ss.android.ugc.aweme.services.publish.IAVMentionEditText
    public final void addHashTag(String str) {
        if (!TextUtils.isEmpty(this.LLLIIIL)) {
            return;
        }
        this.LLLIIIL = " " + str;
        if (C2204961BRm.p(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhisvAnsI1COnw46mruPGkfmgoDo5gyOdr+Qoa", null)) == null) {
            return;
        }
        C2204961BRm.p(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhisvAnsI1COnw46mruPGkfmgoDo5gyOdr+Qoa", null)).insert(Math.max(getSelectionEnd(), C2204961BRm.p(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhisvAnsI1COnw46mruPGkfmgoDo5gyOdr+Qoa", null)).length()), this.LLLIIIL);
        C2204961BRm.p(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhisvAnsI1COnw46mruPGkfmgoDo5gyOdr+Qoa", null)).setSpan(new AdSpan(C960203pA.LIZ(R.attr.a1k, getContext())), getCurAdTagStart(), C2204961BRm.p(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhisvAnsI1COnw46mruPGkfmgoDo5gyOdr+Qoa", null)).length(), 33);
        LJJIIJ(this.LLLLIILL);
        this.LLLIIL = Boolean.TRUE;
    }

    @Override // X.C0ZIH, com.ss.android.ugc.aweme.services.publish.IAVMentionEditText
    public final void addNormalHashTag(String str) throws Throwable {
        if (TextUtils.isEmpty(str) || C2204961BRm.p(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhisvAnsI1COnw46mruPGkfmgoDo5gyOdr+Qoa", null)) == null) {
            return;
        }
        ArrayList<String> arrayListLIZLLL = C856940XjY.LIZLLL(str);
        int length = getNoAdTagText().length();
        this.LLJLILLLLZIIL.add("#" + str);
        if (arrayListLIZLLL.contains("#" + str)) {
            return;
        }
        C857030Xjh c857030XjhLIZ = C856940XjY.LIZ(length, str);
        arrayListLIZLLL.add("#" + str);
        if (c857030XjhLIZ.LIZIZ <= this.LLLJL.LIZIZ() + C855380Xh2.LIZ) {
            this.LLLLIILLL = false;
            C2204961BRm.p(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhisvAnsI1COnw46mruPGkfmgoDo5gyOdr+Qoa", null)).insert(c857030XjhLIZ.LIZ, c857030XjhLIZ.LIZJ);
        }
        LJJJI(true);
    }

    @Override // android.widget.TextView
    public final boolean bringPointIntoView(int i) {
        if (this.LLLLIIIILLL) {
            return false;
        }
        return super.bringPointIntoView(i);
    }

    @Override // android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.LLLLII) {
            return super.dispatchTouchEvent(motionEvent);
        }
        motionEvent.getAction();
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        if (motionEvent.getAction() == 0) {
            C0M2U c0m2u = C0M2U.LIZ;
            VideoPublishEditModel videoPublishEditModel = this.LLJJIJIL;
            c0m2u.getClass();
            C0M2U.LIZ(videoPublishEditModel, "description", null);
        }
        if (this.LLLLII) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return zOnTouchEvent;
    }

    @Override // X.C0ZIH, com.ss.android.ugc.aweme.services.publish.IAVMentionEditText
    public final void removeNormalHashTag(String str) throws Throwable {
        if (TextUtils.isEmpty(str) || C2204961BRm.p(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhisvAnsI1COnw46mruPGkfmgoDo5gyOdr+Qoa", null)) == null) {
            return;
        }
        String str2 = "#" + str + " ";
        String noAdTagText = getNoAdTagText();
        if (TextUtils.isEmpty(noAdTagText)) {
            return;
        }
        for (C857030Xjh c857030Xjh : (ArrayList) LJJIJL(noAdTagText)) {
            if (str2.equals(c857030Xjh.LIZJ)) {
                C2204961BRm.p(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhisvAnsI1COnw46mruPGkfmgoDo5gyOdr+Qoa", null)).delete(c857030Xjh.LIZ, c857030Xjh.LIZIZ);
                LJJJI(true);
                return;
            }
        }
    }

    public void setAccountTagView(View view) {
        this.LLLJ = view;
    }

    public void setAigcPrefillPrefixEndExclusive(int i) {
        if (i > 0) {
            this.LLLILZJ = i;
        }
    }

    public void setConfig(C855530XhH c855530XhH) {
        this.LLLJL = c855530XhH;
    }

    public void setCreationId(String str) {
        this.LLJLLL = str;
    }

    public void setDescLimitToastSuppressed(boolean z) {
        C0ZIF c0zif = this.LLLILZLLLI;
        if (c0zif != null) {
            c0zif.LLIZLLLIL = z;
        }
    }

    public void setEmoticonFilter(int i) {
        InputFilter inputFilter = this.LLLILZLLLI;
        if (inputFilter != null) {
            LJJJJI(inputFilter);
        }
        C855380Xh2.LIZ = i;
        C0ZIF c0zif = new C0ZIF(this.LLLJL.LIZIZ() + C855380Xh2.LIZ, this, this.LLLJL.LIZ());
        this.LLLILZLLLI = c0zif;
        c0zif.LLILZLL = new C0ZI9(this);
        LJJIIJ(c0zif);
    }

    public void setFixLengthInFront(String str) {
        int length;
        InputFilter inputFilter = this.LLLIILIL;
        if (inputFilter != null) {
            LJJJJI(inputFilter);
        }
        if (TextUtils.isEmpty(str) || length() < (length = str.length())) {
            return;
        }
        C0ZIB c0zib = new C0ZIB(new C0ZIA(this), length, this);
        this.LLLIILIL = c0zib;
        LJJIIJ(c0zib);
        this.LLLI = new C0ZI3(this, length);
    }

    public void setFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.LLLLIIL = onFocusChangeListener;
    }

    public void setFragmentActivity(C19EG c19eg) {
        this.LLLJIL = c19eg;
    }

    public void setHashTagView(View view) {
        this.LLLIZZ = view;
    }

    public void setSuppressAutoScrollToCursor(boolean z) {
        this.LLLLIIIILLL = z;
    }

    @Override // X.C0ZIH
    public void setTextExtraList(List<TextExtraStruct> list) throws Exception {
        super.setTextExtraList(list);
        Editable editableP = C2204961BRm.p(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhisvAnsI1COnw46mruPGkfmgoDo5gyOdr+Qoa", null));
        if (editableP != null && !TextUtils.isEmpty(getNoAdTagText())) {
            int length = getNoAdTagText().length();
            if (C086I.LIZIZ(list)) {
                return;
            }
            for (TextExtraStruct textExtraStruct : list) {
                if (textExtraStruct != null) {
                    if (textExtraStruct.getType() == 1) {
                        if (textExtraStruct.getStart() <= length && textExtraStruct.getEnd() <= length && textExtraStruct.getStart() <= textExtraStruct.getEnd()) {
                            LJJJJLI(textExtraStruct, editableP);
                        }
                    }
                    if ((textExtraStruct.getType() == 0 && !TextUtils.isEmpty(textExtraStruct.getAwemeId())) || (textExtraStruct.getType() == 5 && !TextUtils.isEmpty(textExtraStruct.getAwemeId()))) {
                        if (textExtraStruct.getStart() <= length && textExtraStruct.getEnd() <= length && textExtraStruct.getStart() <= textExtraStruct.getEnd()) {
                            if (textExtraStruct.getEnd() < length && editableP.charAt(textExtraStruct.getEnd()) == 160) {
                                editableP.replace(textExtraStruct.getEnd(), textExtraStruct.getEnd() + 1, " ");
                            }
                            if (textExtraStruct.getSubtype() == 1 || C11VF.LIZIZ.LIZ(textExtraStruct.getSubtype())) {
                                C0GZ6 c0gz6 = new C0GZ6(getContext(), new C0GZ7() { // from class: X.0ZI5
                                    @Override // X.C0GZ7
                                    public final void LIZ() {
                                    }

                                    @Override // X.C0GZ7
                                    public final int getMaxWidth() {
                                        return this.LIZ.LLLFF;
                                    }
                                });
                                this.LLJZ = c0gz6;
                                editableP.setSpan(c0gz6, textExtraStruct.getStart(), textExtraStruct.getEnd(), 33);
                                this.LLJLLIL++;
                            }
                        }
                    }
                    if (textExtraStruct.getType() == 0 && textExtraStruct.getSubtype() == 2 && textExtraStruct.getStart() <= length && textExtraStruct.getEnd() <= length && textExtraStruct.getStart() <= textExtraStruct.getEnd() && textExtraStruct.getStart() >= 0) {
                        C0GZ8 c0gz8 = new C0GZ8(getContext(), new C0GZ7() { // from class: X.0ZI6
                            @Override // X.C0GZ7
                            public final void LIZ() {
                            }

                            @Override // X.C0GZ7
                            public final int getMaxWidth() {
                                return this.LIZ.LLLFF;
                            }
                        });
                        this.LLL = c0gz8;
                        c0gz8.LLJILJILJ = Integer.valueOf(R.raw.icon_comment_fill);
                        editableP.setSpan(this.LLL, textExtraStruct.getStart(), textExtraStruct.getEnd(), 33);
                        this.LLLF = 1;
                    }
                }
            }
        }
    }

    public void setVideoType(int i) {
        this.LLLFFI = i;
    }

    public C0ZI0(Context context, AttributeSet attributeSet) {
        String string;
        super(context, attributeSet);
        this.LLJLLL = "";
        this.LLLII = new HashSet<>();
        this.LLLIIII = "";
        if (getHint() == null) {
            string = "";
        } else {
            string = getHint().toString();
        }
        this.LLLIIIIL = string;
        this.LLLIIIL = "";
        this.LLLIIL = Boolean.FALSE;
        this.LLLIILIL = null;
        this.LLLIL = false;
        this.LLLILZ = null;
        this.LLLILZJ = 0;
        this.LLLILZLLLI = null;
        this.LLLIZZ = null;
        this.LLLJ = null;
        this.LLLJIL = null;
        this.LLLJL = null;
        this.LLLLII = true;
        this.LLLLIIIILLL = false;
        View.OnFocusChangeListener onFocusChangeListener = new View.OnFocusChangeListener() { // from class: X.0ZI2
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                View.OnFocusChangeListener onFocusChangeListener2 = this.LL.LLLLIIL;
                if (onFocusChangeListener2 != null) {
                    onFocusChangeListener2.onFocusChange(view, z);
                }
                if (z) {
                    if (!TextUtils.isEmpty(this.LL.LLLIIII)) {
                        C0ZI0 c0zi0 = this.LL;
                        c0zi0.addHashTag(c0zi0.LLLIIII);
                        C0ZI0 c0zi02 = this.LL;
                        c0zi02.setHint(c0zi02.LLLIIIIL);
                        this.LL.LLLIIII = "";
                        return;
                    }
                    return;
                }
                if (!TextUtils.isEmpty(this.LL.getNoAdTagText())) {
                    return;
                }
                C0ZI0 c0zi03 = this.LL;
                c0zi03.LLLIIII = c0zi03.getAdTag();
                this.LL.removeHashTag();
                C0ZI0 c0zi04 = this.LL;
                c0zi04.LLLIIIIL = c0zi04.getHint().toString();
                C0ZI0 c0zi05 = this.LL;
                c0zi05.setHint(TextUtils.concat(c0zi05.getHint(), this.LL.LLLIIII));
            }
        };
        this.LLLLIILL = new InputFilter() { // from class: X.0ZI4
            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
                return C0ZI0.LJJIII(this.LL, charSequence, spanned, i3, i4);
            }
        };
        this.LLLLIILLL = false;
        this.LLLLIL = false;
        this.LLLLILI = 0;
        addTextChangedListener(new C0ZI1(this));
        setOnFocusChangeListener(onFocusChangeListener);
    }

    public static void LJJJJL(String str, String str2) {
        if (TextUtils.equals(o.LJIIZILJ.getCurrentUserID(), str)) {
            o.LJIIIIZZ.saveLocalHashTag(true, str2);
        }
    }

    @Override // X.C0ZIH
    public final void LJJ(AiCopyWritingSpan aiCopyWritingSpan, C0ZI7 c0zi7) {
        List<C0ZI7> list;
        if (AVCommerceServiceImpl.LJIIJ().LIZ(aiCopyWritingSpan.mText) != null && getNoAdTagText().length() > c0zi7.LIZJ && String.valueOf(getNoAdTagText().charAt(c0zi7.LIZJ)).equals(getContext().getString(2131848665))) {
            ((ArrayList) this.LLJILJIL).add(new C0ZI7(c0zi7.LIZIZ, c0zi7.LIZJ + 1));
        }
        if (!TextUtils.isEmpty(aiCopyWritingSpan.mText) && !this.LLLII.contains(aiCopyWritingSpan.mText)) {
            if (((HashSet) this.LLJLILLLLZIIL).contains(aiCopyWritingSpan.mText) && (list = this.LLJILJIL) != null) {
                ((ArrayList) list).add(c0zi7);
            }
        }
    }

    @Override // X.C0ZIH
    public final void LJJI(MentionSpan mentionSpan, C0ZI7 c0zi7) {
        List<C0ZI7> list;
        if (AVCommerceServiceImpl.LJIIJ().LIZ(mentionSpan.mText) != null && getNoAdTagText().length() > c0zi7.LIZJ && String.valueOf(getNoAdTagText().charAt(c0zi7.LIZJ)).equals(getContext().getString(2131848665))) {
            ((ArrayList) this.LLJILJIL).add(new C0ZI7(c0zi7.LIZIZ, c0zi7.LIZJ + 1));
        }
        if (!TextUtils.isEmpty(mentionSpan.mText) && !this.LLLII.contains(mentionSpan.mText)) {
            if (((HashSet) this.LLJLILLLLZIIL).contains(mentionSpan.mText) && (list = this.LLJILJIL) != null) {
                ((ArrayList) list).add(c0zi7);
            }
        }
    }

    public final List<TextExtraStruct> LJJIJIL(String str, boolean z) throws Throwable {
        Editable editableP;
        if (z) {
            editableP = LJJIIZI();
        } else {
            editableP = C2204961BRm.p(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhisvAnsI1COnw46mruPGkfmgoDo5gyOdr+Qoa", null));
        }
        if (TextUtils.isEmpty(editableP)) {
            return null;
        }
        LJJJ(editableP);
        Object[] objArr = (C0ZI8[]) editableP.getSpans(0, editableP.length(), C0ZI8.class);
        int length = objArr.length;
        int[] iArr = new int[length];
        if (objArr.length > 0) {
            for (int i = 0; i < length; i++) {
                iArr[i] = editableP.getSpanStart(objArr[i]);
            }
            Arrays.sort(iArr);
        }
        ArrayList arrayList = new ArrayList();
        MentionSpan[] mentionSpanArrLJIJ = LJIJ(editableP);
        if (mentionSpanArrLJIJ != null) {
            for (MentionSpan mentionSpan : mentionSpanArrLJIJ) {
                int i2 = mentionSpan.mType;
                if (i2 == 0 || i2 == 5) {
                    int spanStart = editableP.getSpanStart(mentionSpan);
                    int i3 = 0;
                    for (int i4 = 0; i4 < length; i4++) {
                        if (spanStart > iArr[i4]) {
                            i3++;
                        }
                    }
                    mentionSpan.mStruct.setStart(editableP.getSpanStart(mentionSpan) - i3);
                    mentionSpan.mStruct.setEnd(editableP.getSpanEnd(mentionSpan) - i3);
                    arrayList.add(mentionSpan.mStruct);
                }
            }
        }
        AiCopyWritingSpan[] aiCopyWritingSpanArrLJIILLIIL = LJIILLIIL(editableP);
        if (aiCopyWritingSpanArrLJIILLIIL != null) {
            for (AiCopyWritingSpan aiCopyWritingSpan : aiCopyWritingSpanArrLJIILLIIL) {
                int spanStart2 = editableP.getSpanStart(aiCopyWritingSpan);
                int i5 = 0;
                for (int i6 = 0; i6 < length; i6++) {
                    if (spanStart2 > iArr[i6]) {
                        i5++;
                    }
                }
                aiCopyWritingSpan.mStruct.setStart(editableP.getSpanStart(aiCopyWritingSpan) - i5);
                aiCopyWritingSpan.mStruct.setEnd(editableP.getSpanEnd(aiCopyWritingSpan) - i5);
                aiCopyWritingSpan.mStruct.setHashTagName(aiCopyWritingSpan.mText);
                arrayList.add(aiCopyWritingSpan.mStruct);
            }
        }
        for (C857030Xjh c857030Xjh : (ArrayList) LJJIJ(LJIJI(editableP))) {
            int i7 = c857030Xjh.LIZ;
            int i8 = 0;
            for (int i9 = 0; i9 < length; i9++) {
                if (i7 > iArr[i9]) {
                    i8++;
                }
            }
            MentionSpan[] mentionSpanArr = (MentionSpan[]) editableP.getSpans(c857030Xjh.LIZ, c857030Xjh.LIZIZ, MentionSpan.class);
            if (mentionSpanArr != null) {
                boolean z2 = false;
                for (MentionSpan mentionSpan2 : mentionSpanArr) {
                    TextExtraStruct textExtraStruct = mentionSpan2.mStruct;
                    if (textExtraStruct != null && textExtraStruct.getType() != 1) {
                        z2 = true;
                    }
                }
                if (z2) {
                }
            }
            TextExtraStruct textExtraStruct2 = new TextExtraStruct();
            textExtraStruct2.setType(1);
            textExtraStruct2.setHashTagName(c857030Xjh.LIZJ.replaceAll("#", ""));
            textExtraStruct2.setStart(c857030Xjh.LIZ - i8);
            textExtraStruct2.setEnd(c857030Xjh.LIZIZ - i8);
            int iLJJIZ = LJJIZ(c857030Xjh.LIZ, c857030Xjh.LIZIZ, editableP);
            if (LJJIJLIJ(iLJJIZ)) {
                textExtraStruct2.setSubType(iLJJIZ);
            }
            arrayList.add(textExtraStruct2);
            LJJJJL(str, textExtraStruct2.getHashTagName());
        }
        return arrayList;
    }

    public final void LJJJJIZL(int i, int i2) throws Throwable {
        if (i >= i2 || C2204961BRm.p(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhisvAnsI1COnw46mruPGkfmgoDo5gyOdr+Qoa", null)) == null) {
            return;
        }
        Editable editableP = C2204961BRm.p(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhisvAnsI1COnw46mruPGkfmgoDo5gyOdr+Qoa", null));
        Objects.requireNonNull(editableP);
        for (MentionSpan mentionSpan : (MentionSpan[]) editableP.getSpans(i, i2, MentionSpan.class)) {
            C2204961BRm.p(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhisvAnsI1COnw46mruPGkfmgoDo5gyOdr+Qoa", null)).removeSpan(mentionSpan);
        }
    }

    public final void LJJJJLI(TextExtraStruct textExtraStruct, Editable editable) throws Exception {
        int end;
        MentionSpan mentionSpan;
        int length;
        if (textExtraStruct.getEnd() - textExtraStruct.getStart() > 71) {
            String string = getContext().getString(2131835470, 70);
            C19EG c19eg = this.LLLJIL;
            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
            creativeToastBuilder.isCenterToast(C859340XnQ.LIZIZ());
            creativeToastBuilder.message(string);
            creativeToastBuilder.isTuxToastLegacy(true);
            C1390380mHk.LIZ(c19eg, 4010, creativeToastBuilder);
            editable.replace(textExtraStruct.getStart() + 70 + 1, textExtraStruct.getEnd(), "");
            end = editable.length();
        } else {
            end = textExtraStruct.getEnd();
        }
        try {
            int i = this.LLIZLLLIL;
            mentionSpan = new MentionSpan(editable.subSequence(textExtraStruct.getStart(), end).toString(), i, textExtraStruct.getCommentId(), textExtraStruct.getUserId(), textExtraStruct.getAtUserType(), textExtraStruct.getType(), textExtraStruct.getSecUid());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C201955140j.LJI("HashTagMentionEditText", e);
            SettingsManager.LIZLLL().getClass();
            if (!SettingsManager.LIZ("tool_enable_publish_input_exception_rethrow", false)) {
                mentionSpan = null;
            } else {
                throw e;
            }
        }
        if (end >= editable.length()) {
            length = editable.length() - 1;
        } else {
            length = end;
        }
        try {
            LJJJJJ(editable, textExtraStruct.getStart(), length, true);
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            editable.setSpan(mentionSpan, textExtraStruct.getStart(), end, 33);
            if (mentionSpan != null && LJJIJLIJ(textExtraStruct.getSubtype())) {
                mentionSpan.LIZ(textExtraStruct.getSubtype());
            }
        } catch (Exception e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        this.LLLFF = View.MeasureSpec.getSize(i);
        super.onMeasure(i, i2);
        int height = getLayout().getHeight();
        int totalPaddingTop = getTotalPaddingTop();
        this.LLLL = ((height + totalPaddingTop) + getTotalPaddingBottom()) - getHeight();
    }

    @Override // X.C0ZIH, X.C0ZIJ, android.widget.TextView
    public final void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
        if (this.LLJILJILJ) {
            return;
        }
        C0ZID c0zid = this.LLLI;
        if (c0zid != null) {
            C0ZI3 c0zi3 = (C0ZI3) c0zid;
            if (i != 0 || i2 != c0zi3.LIZJ.length()) {
                if (i < c0zi3.LIZIZ) {
                    c0zi3.LIZJ.setSelection(c0zi3.LIZ);
                } else {
                    c0zi3.LIZ = i;
                }
            }
        }
        if (C2204961BRm.p(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhisvAnsI1COnw46mruPGkfmgoDo5gyOdr+Qoa", null)) != null && i >= 0 && i2 >= 0 && i < i2 && C2204961BRm.p(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhisvAnsI1COnw46mruPGkfmgoDo5gyOdr+Qoa", null)) != null) {
            String string = C2204961BRm.p(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhisvAnsI1COnw46mruPGkfmgoDo5gyOdr+Qoa", null)).subSequence(i, i2).toString();
            if (!TextUtils.isEmpty(C2204961BRm.p(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhisvAnsI1COnw46mruPGkfmgoDo5gyOdr+Qoa", null)).toString())) {
                ((ICommerceToolsMissionService) ServiceManager.get().getService(ICommerceToolsMissionService.class)).LIZ(string, i2, this.LLJJIJIL, this.LLLIIIL, C2204961BRm.p(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhisvAnsI1COnw46mruPGkfmgoDo5gyOdr+Qoa", null)).toString(), this.LLLJIL);
            }
        }
    }

    public final int LJJIZ(int i, int i2, Editable editable) {
        if (this.LLLILZJ <= 0 || editable == null) {
            return 0;
        }
        MentionSpan[] mentionSpanArr = (MentionSpan[]) editable.getSpans(i, i2, MentionSpan.class);
        if (mentionSpanArr != null) {
            for (MentionSpan mentionSpan : mentionSpanArr) {
                if (mentionSpan != null && mentionSpan.mType == 1 && LJJIJLIJ(mentionSpan.subType)) {
                    return 18;
                }
            }
        }
        int i3 = this.LLLILZJ;
        if (i3 <= 0 || i < 0 || i2 <= i || i2 > i3) {
            return 0;
        }
        return 18;
    }

    public static void LJJJJJ(Editable editable, int i, int i2, boolean z) {
        if (i >= i2 || editable == null) {
            return;
        }
        for (MentionSpan mentionSpan : (MentionSpan[]) editable.getSpans(i, i2, MentionSpan.class)) {
            if (editable.getSpanEnd(mentionSpan) < editable.length() && editable.getSpanStart(mentionSpan) > -1) {
                if (z) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("oldSpan: ");
                    sbLIZ.append(mentionSpan.mText);
                    sbLIZ.append(" oldSpan.start:");
                    sbLIZ.append(editable.getSpanStart(mentionSpan));
                    sbLIZ.append(" oldSpan.end:");
                    sbLIZ.append(editable.getSpanEnd(mentionSpan));
                    sbLIZ.append("\n editable: ");
                    sbLIZ.append((Object) editable);
                    sbLIZ.append(" editable.length: ");
                    sbLIZ.append(editable.length());
                    ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("MentionEditText", C2188811AlT.LIZIZ(sbLIZ));
                }
                editable.removeSpan(mentionSpan);
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        if (!this.LLLLII) {
            return;
        }
        if (i2 == this.LLLL || i2 == 0) {
            getParent().requestDisallowInterceptTouchEvent(false);
        }
    }

    @Override // X.C0ZIH, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        String string;
        LJIILL();
        if (charSequence == null) {
            string = "";
        } else {
            string = charSequence.toString();
        }
        for (String str : this.LLJLILLLLZIIL) {
            if (!string.contains(str)) {
                this.LLLII.add(str);
            }
        }
    }

    public static /* synthetic */ CharSequence LJJIII(C0ZI0 c0zi0, CharSequence charSequence, Spanned spanned, int i, int i2) {
        int length = spanned.length() - c0zi0.LLLIIIL.length();
        if (length < 0) {
            length = 0;
        }
        if (TextUtils.isEmpty(charSequence) && i2 > length) {
            return spanned.subSequence(i, i2);
        }
        if (i2 > length) {
            return "";
        }
        return null;
    }
}
