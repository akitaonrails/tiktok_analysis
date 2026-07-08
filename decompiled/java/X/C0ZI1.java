package X;

import Y.AComparatorS33S0000000_14;
import Y.ARunnableS114S0100000_14;
import Y.ARunnableS20S0201000_14;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.util.Pair;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.commerce.tools.mission.service.ICommerceToolsMissionService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.internal.AVCommerceServiceImpl;
import com.ss.android.ugc.aweme.lexical.platform.span.MentionSpan;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: X.0ZI1, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public class C0ZI1 extends C856950XjZ {
    public int LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ C0ZI0 LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0ZI1(C0ZI0 c0zi0) {
        super("HashTagMentionEditText");
        this.LLILZ = c0zi0;
    }

    @Override // X.C856950XjZ, android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean z;
        String strSubstring;
        int i;
        Pair pair;
        super.afterTextChanged(editable);
        if (!this.LLILZ.LLLLIILLL) {
            C0ZI0 c0zi0 = this.LLILZ;
            int length = this.LLILLJJLI + this.LLILLL;
            c0zi0.LJJIFFI();
            Object[] objArr = (C0ZI8[]) editable.getSpans(0, editable.length(), C0ZI8.class);
            if (objArr.length > 0) {
                int length2 = objArr.length;
                int[] iArr = new int[length2];
                for (int i2 = 0; i2 < length2; i2++) {
                    iArr[i2] = editable.getSpanStart(objArr[i2]);
                }
                Arrays.sort(iArr);
                for (int i3 = length2 - 1; i3 >= 0; i3--) {
                    int i4 = iArr[i3];
                    editable.delete(i4, i4 + 1);
                    if (length >= iArr[i3]) {
                        length--;
                    }
                }
                z = true;
            } else {
                z = false;
            }
            String string = editable.toString();
            LinkedHashMap<String, Bitmap> linkedHashMapLJI = AVCommerceServiceImpl.LJIIJ().LJI();
            for (int i5 = 1; string.length() > i5; i5 = 1) {
                int length3 = string.length();
                if (!TextUtils.isEmpty(string)) {
                    for (int i6 = length3 - 1; i6 >= 0; i6--) {
                        char cCharAt = string.charAt(i6);
                        if (cCharAt != ' ' && !String.valueOf(cCharAt).equals(c0zi0.getContext().getString(2131848665)) && cCharAt != '@' && cCharAt != '\n') {
                            if (cCharAt == '#') {
                                pair = new Pair(Integer.valueOf(i6), Integer.valueOf(length3));
                                break;
                            }
                        } else {
                            pair = new Pair(Integer.valueOf(i6), -1);
                            break;
                        }
                    }
                    pair = new Pair(-1, -1);
                } else {
                    pair = new Pair(-1, -1);
                }
                if (((Integer) pair.second).intValue() == -1) {
                    if (((Integer) pair.first).intValue() > 0) {
                        string = string.substring(0, ((Integer) pair.first).intValue());
                    } else {
                        string = "";
                    }
                } else {
                    String lowerCase = string.substring(((Integer) pair.first).intValue(), ((Integer) pair.second).intValue()).toLowerCase(Locale.getDefault());
                    if (linkedHashMapLJI != null && linkedHashMapLJI.containsKey(lowerCase.substring(1))) {
                        Bitmap bitmap = linkedHashMapLJI.get(lowerCase.substring(1));
                        if (bitmap != null) {
                            final BitmapDrawable bitmapDrawable = new BitmapDrawable(bitmap);
                            bitmapDrawable.setBounds(0, 0, (int) c0zi0.getTextSize(), (int) c0zi0.getTextSize());
                            Object obj = new C416750GVt(bitmapDrawable) { // from class: X.0ZI8
                            };
                            editable.insert(string.length(), c0zi0.getContext().getString(2131848665));
                            if (editable.length() >= string.length() + 1) {
                                editable.setSpan(obj, string.length(), string.length() + 1, 33);
                            }
                        }
                        if (length > string.length()) {
                            length++;
                        }
                        z = true;
                    }
                    string = string.substring(0, ((Integer) pair.first).intValue());
                }
            }
            if (z) {
                System.currentTimeMillis();
                ArrayList<C0ZI7> arrayList = new ArrayList();
                if (TextUtils.isEmpty(c0zi0.LLLIIIL)) {
                    strSubstring = editable.toString();
                } else {
                    strSubstring = editable.toString().substring(0, c0zi0.getCurAdTagStart());
                }
                for (C857030Xjh c857030Xjh : (ArrayList) c0zi0.LJJIJ(strSubstring)) {
                    arrayList.add(new C0ZI7(c857030Xjh.LIZ, c857030Xjh.LIZIZ));
                }
                ArrayList<C0ZI7> arrayList2 = new ArrayList(arrayList);
                List<C0ZI7> list = c0zi0.LLJILJIL;
                if (list != null && !((ArrayList) list).isEmpty()) {
                    for (C0ZI7 c0zi7 : (ArrayList) c0zi0.LLJILJIL) {
                        if (c0zi7.LIZ) {
                            arrayList2.add(c0zi7);
                        }
                    }
                }
                Collections.sort(arrayList2, new AComparatorS33S0000000_14(32));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                for (C0ZI7 c0zi72 : arrayList) {
                    if (!c0zi72.LIZ(c0zi0.getSelectionStart() - 1, c0zi0.getSelectionEnd() - 1) && !c0zi72.LIZ(c0zi0.getSelectionStart() + 1, c0zi0.getSelectionEnd() + 1)) {
                        int i7 = c0zi72.LIZIZ;
                        int i8 = c0zi72.LIZJ;
                        int i9 = c0zi0.LLLILZJ;
                        if (i9 <= 0 || i7 < 0 || i8 <= i7 || i8 > i9) {
                        }
                    }
                    spannableStringBuilder.append((CharSequence) strSubstring.substring(c0zi72.LIZIZ, c0zi72.LIZJ));
                    int iLJJIZ = c0zi0.LJJIZ(c0zi72.LIZIZ, c0zi72.LIZJ, editable);
                    MentionSpan mentionSpan = new MentionSpan(spannableStringBuilder.toString(), c0zi0.LLIZLLLIL, 0L, "", "", 1, "");
                    C0ZI0.LJJJJJ(editable, c0zi72.LIZIZ, c0zi72.LIZJ, false);
                    if (C0ZI0.LJJIJLIJ(iLJJIZ)) {
                        mentionSpan.LIZ(iLJJIZ);
                    }
                    editable.setSpan(mentionSpan, c0zi72.LIZIZ, c0zi72.LIZJ, 33);
                    editable.setSpan(new StyleSpan(1), c0zi72.LIZIZ, c0zi72.LIZJ, 33);
                    spannableStringBuilder.clear();
                }
                int length4 = strSubstring.length();
                int i10 = 0;
                for (C0ZI7 c0zi73 : arrayList2) {
                    if (i10 >= 0 && (i = c0zi73.LIZIZ) <= length4 && i10 <= i) {
                        if (i10 < i) {
                            int i11 = c0zi0.LLLILZJ;
                            if (i11 <= 0) {
                                C0ZI0.LJJJJJ(editable, i10, i, false);
                            } else if (i > i11) {
                                if (i10 < i11) {
                                    i10 = i11;
                                }
                                if (i10 < i) {
                                    C0ZI0.LJJJJJ(editable, i10, i, false);
                                }
                            }
                        }
                        i10 = c0zi73.LIZJ;
                    }
                }
                if (i10 <= length4 && i10 < length4) {
                    int i12 = c0zi0.LLLILZJ;
                    if (i12 <= 0) {
                        C0ZI0.LJJJJJ(editable, i10, length4, false);
                    } else if (length4 > i12) {
                        if (i10 < i12) {
                            i10 = i12;
                        }
                        if (i10 < length4) {
                            C0ZI0.LJJJJJ(editable, i10, length4, false);
                        }
                    }
                }
                c0zi0.LJJJ(editable);
                if (editable.length() != 0) {
                    c0zi0.LJJJIL(editable);
                    c0zi0.LJJJJ(editable);
                }
                if (C2204961BRm.p(c0zi0, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhisvAnsI1COnw46mruPGkfmgoDo5gyOdr+Qoa", null)) != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("full: \n  text: ");
                    sbLIZ.append(C2204961BRm.p(c0zi0, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhisvAnsI1COnw46mruPGkfmgoDo5gyOdr+Qoa", null)).toString());
                    sbLIZ.append(" and se: ");
                    sbLIZ.append(c0zi0.getSelectionEnd());
                    C2344809Gs.LJFF("MentionEditText", C2188811AlT.LIZIZ(sbLIZ));
                }
            }
            c0zi0.LJIIJJI();
            if (z) {
                c0zi0.LLLLIILLL = true;
                c0zi0.LLLLILI = length;
                c0zi0.setCursorVisible(false);
                C0ZIB c0zib = c0zi0.LLLIILIL;
                if (c0zib != null) {
                    c0zi0.LJJJJI(c0zib);
                }
                if (c0zi0.LLLIIL.booleanValue()) {
                    c0zi0.LJJJJI(c0zi0.LLLLIILL);
                }
                if (length >= editable.length()) {
                    length = editable.length();
                }
                if (c0zi0.LLLIILIL != null) {
                    HandlerHook.viewPost(c0zi0, new ARunnableS114S0100000_14((Object) c0zi0, 60));
                }
                if (c0zi0.LLLIIL.booleanValue()) {
                    HandlerHook.viewPost(c0zi0, new ARunnableS114S0100000_14((Object) c0zi0, 61));
                }
                HandlerHook.viewPost(c0zi0, new ARunnableS20S0201000_14(c0zi0, length, editable, 8));
                HandlerHook.viewPost(c0zi0, new ARunnableS114S0100000_14((Object) c0zi0, 62));
            }
        }
        HandlerHook.viewPost(this.LLILZ, new ARunnableS114S0100000_14(this, 63));
    }

    @Override // X.C856950XjZ, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.beforeTextChanged(charSequence, i, i2, i3);
        if (i3 == 0) {
            if (C2204961BRm.p(this.LLILZ, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhisvAnsI1COnw46mruPGkfmgoDo5gyOdr+Qoa", null)) != null && !TextUtils.isEmpty(C2204961BRm.p(this.LLILZ, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhisvAnsI1COnw46mruPGkfmgoDo5gyOdr+Qoa", null)).toString())) {
                C0ZI0 c0zi0 = this.LLILZ;
                ((ICommerceToolsMissionService) ServiceManager.get().getService(ICommerceToolsMissionService.class)).LJIILIIL(i, i + i2, c0zi0.LLJJIJIL, c0zi0.LLLIIIL, C2204961BRm.p(c0zi0, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhisvAnsI1COnw46mruPGkfmgoDo5gyOdr+Qoa", null)).toString());
                return;
            }
            return;
        }
        if (i3 <= 0 || C2204961BRm.p(this.LLILZ, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhisvAnsI1COnw46mruPGkfmgoDo5gyOdr+Qoa", null)) == null || TextUtils.isEmpty(C2204961BRm.p(this.LLILZ, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhisvAnsI1COnw46mruPGkfmgoDo5gyOdr+Qoa", null)).toString())) {
            return;
        }
        ((ICommerceToolsMissionService) ServiceManager.get().getService(ICommerceToolsMissionService.class)).LIZJ(i, this.LLILZ.LLJJIJIL, C2204961BRm.p(this.LLILZ, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhisvAnsI1COnw46mruPGkfmgoDo5gyOdr+Qoa", null)).toString());
    }

    @Override // X.C856950XjZ, android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) throws Exception {
        Editable editableP;
        Editable editableP2;
        int length;
        super.onTextChanged(charSequence, i, i2, i3);
        Editable editableP3 = C2204961BRm.p(this.LLILZ, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhisvAnsI1COnw46mruPGkfmgoDo5gyOdr+Qoa", null));
        this.LLILLL = i3;
        this.LLILLJJLI = i;
        if (editableP3 != null && !TextUtils.isEmpty(editableP3.toString())) {
            List<TextExtraStruct> compatTextExtraStructList = this.LLILZ.getCompatTextExtraStructList();
            int length2 = editableP3.length();
            for (TextExtraStruct textExtraStruct : compatTextExtraStructList) {
                if (textExtraStruct != null && textExtraStruct.getType() == 1 && textExtraStruct.getStart() <= length2 && textExtraStruct.getEnd() <= length2 && textExtraStruct.getStart() <= textExtraStruct.getEnd()) {
                    this.LLILZ.LJJJJLI(textExtraStruct, editableP3);
                }
            }
        }
        C0ZI0 c0zi0 = this.LLILZ;
        int length3 = 0;
        if (c0zi0.LLJLLIL != 0 && c0zi0.LLJZ != null && (editableP2 = C2204961BRm.p(c0zi0, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhisvAnsI1COnw46mruPGkfmgoDo5gyOdr+Qoa", null))) != null) {
            C0GZ6[] c0gz6Arr = (C0GZ6[]) editableP2.getSpans(0, editableP2.length(), C0GZ6.class);
            if (c0gz6Arr == null) {
                length = 0;
            } else {
                length = c0gz6Arr.length;
            }
            if (c0zi0.LLJLLIL == 1 && length == 0) {
                c0zi0.LJJIIZ();
            }
            c0zi0.LLJLLIL = length;
        }
        C0ZI0 c0zi02 = this.LLILZ;
        if (c0zi02.LLLF != 0 && c0zi02.LLL != null && (editableP = C2204961BRm.p(c0zi02, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhisvAnsI1COnw46mruPGkfmgoDo5gyOdr+Qoa", null))) != null) {
            C0GZ8[] c0gz8Arr = (C0GZ8[]) editableP.getSpans(0, editableP.length(), C0GZ8.class);
            if (c0gz8Arr != null) {
                length3 = c0gz8Arr.length;
            }
            if (c0zi02.LLLF == 1 && length3 == 0) {
                c0zi02.LJJIIZ();
            }
            c0zi02.LLLF = length3;
        }
    }
}
