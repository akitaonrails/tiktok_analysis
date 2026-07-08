package X;

import android.text.Editable;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.creative.model.EditPostModel;
import com.ss.android.ugc.aweme.creative.model.publish.AVTextExtraStruct;
import com.ss.android.ugc.aweme.lexical.platform.span.AiCopyWritingSpan;
import com.ss.android.ugc.aweme.lexical.platform.span.MentionSpan;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.AVTextExtraStructHelper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: X.0XmR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C858730XmR {
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static List LIZ(InterfaceC855950Xhx interfaceC855950Xhx, String str, boolean z, int i) throws Throwable {
        boolean z2;
        Editable editableP;
        boolean z3;
        EditPostModel editPostModel;
        AiCopyWritingSpan[] aiCopyWritingSpanArrLJIILLIIL;
        boolean z4;
        EditPostModel editPostModel2;
        if ((i & 2) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        C857470XkP c857470XkP = (C857470XkP) interfaceC855950Xhx;
        c857470XkP.getClass();
        ArrayList arrayList = new ArrayList();
        if (z) {
            editableP = c857470XkP.LIZ.LJJIIZI();
        } else {
            editableP = C2204961BRm.p(c857470XkP.LIZ, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhisvAnsI1COnw46mruPGkfmgoDo5gyOdr+Qoa", null));
        }
        if (!TextUtils.isEmpty(editableP)) {
            c857470XkP.LIZ.LJJJ(editableP);
            C0ZI8[] c0zi8Arr = (C0ZI8[]) editableP.getSpans(0, editableP.length(), C0ZI8.class);
            int length = c0zi8Arr.length;
            int[] iArr = new int[length];
            if (c0zi8Arr.length > 0) {
                for (int i2 = 0; i2 < length; i2++) {
                    iArr[i2] = editableP.getSpanStart(c0zi8Arr[i2]);
                }
                Arrays.sort(iArr);
            }
            MentionSpan[] mentionSpanArrLJIJ = c857470XkP.LIZ.LJIJ(editableP);
            if (mentionSpanArrLJIJ != null) {
                for (MentionSpan mentionSpan : mentionSpanArrLJIJ) {
                    int i3 = mentionSpan.mType;
                    if (i3 == 0 || i3 == 5) {
                        int spanStart = editableP.getSpanStart(mentionSpan);
                        int i4 = 0;
                        for (int i5 = 0; i5 < length; i5++) {
                            if (spanStart > iArr[i5]) {
                                i4++;
                            }
                        }
                        mentionSpan.mStruct.setStart(editableP.getSpanStart(mentionSpan) - i4);
                        mentionSpan.mStruct.setEnd(editableP.getSpanEnd(mentionSpan) - i4);
                        AVTextExtraStruct aVTextExtraStructFrom = AVTextExtraStructHelper.from(mentionSpan.mStruct);
                        VideoPublishEditModel videoPublishEditModel = c857470XkP.LIZ.LLJJIJIL;
                        if (aVTextExtraStructFrom != null) {
                            if (videoPublishEditModel.isDuet() || ((editPostModel2 = videoPublishEditModel.creativeModel.editPostModel) != null && editPostModel2.isDuet())) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            aVTextExtraStructFrom.setDuet(z4);
                        }
                        arrayList.add(aVTextExtraStructFrom);
                    }
                }
            }
            if (!z && (aiCopyWritingSpanArrLJIILLIIL = c857470XkP.LIZ.LJIILLIIL(editableP)) != null) {
                for (AiCopyWritingSpan aiCopyWritingSpan : aiCopyWritingSpanArrLJIILLIIL) {
                    int spanStart2 = editableP.getSpanStart(aiCopyWritingSpan);
                    int i6 = 0;
                    for (int i7 = 0; i7 < length; i7++) {
                        if (spanStart2 > iArr[i7]) {
                            i6++;
                        }
                    }
                    aiCopyWritingSpan.mStruct.setStart(editableP.getSpanStart(aiCopyWritingSpan) - i6);
                    aiCopyWritingSpan.mStruct.setEnd(editableP.getSpanEnd(aiCopyWritingSpan) - i6);
                    arrayList.add(AVTextExtraStructHelper.from(aiCopyWritingSpan.mStruct));
                }
            }
            C0ZI0 c0zi0 = c857470XkP.LIZ;
            for (C857030Xjh c857030Xjh : (ArrayList) c0zi0.LJJIJ(c0zi0.LJIJI(editableP))) {
                int i8 = c857030Xjh.LIZ;
                int i9 = 0;
                for (int i10 = 0; i10 < length; i10++) {
                    if (i8 > iArr[i10]) {
                        i9++;
                    }
                }
                MentionSpan[] mentionSpanArr = (MentionSpan[]) editableP.getSpans(c857030Xjh.LIZ, c857030Xjh.LIZIZ, MentionSpan.class);
                if (mentionSpanArr != null) {
                    boolean z5 = false;
                    for (MentionSpan mentionSpan2 : mentionSpanArr) {
                        TextExtraStruct textExtraStruct = mentionSpan2.mStruct;
                        if (textExtraStruct != null && textExtraStruct.getType() != 1) {
                            z5 = true;
                        }
                    }
                    if (z5) {
                    }
                }
                AVTextExtraStruct aVTextExtraStruct = new AVTextExtraStruct();
                aVTextExtraStruct.type = 1;
                aVTextExtraStruct.hashTagName = c857030Xjh.LIZJ.replaceAll("#", "");
                int i11 = c857030Xjh.LIZ;
                aVTextExtraStruct.start = i11 - i9;
                int i12 = c857030Xjh.LIZIZ;
                aVTextExtraStruct.end = i12 - i9;
                int iLJJIZ = c857470XkP.LIZ.LJJIZ(i11, i12, editableP);
                if (C0ZI0.LJJIJLIJ(iLJJIZ)) {
                    aVTextExtraStruct.subType = iLJJIZ;
                }
                VideoPublishEditModel videoPublishEditModel2 = c857470XkP.LIZ.LLJJIJIL;
                if (videoPublishEditModel2.isDuet() || ((editPostModel = videoPublishEditModel2.creativeModel.editPostModel) != null && editPostModel.isDuet())) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                aVTextExtraStruct.setDuet(z3);
                arrayList.add(aVTextExtraStruct);
                C0ZI0 c0zi02 = c857470XkP.LIZ;
                String str2 = aVTextExtraStruct.hashTagName;
                c0zi02.getClass();
                C0ZI0.LJJJJL(str, str2);
            }
            List<AVTextExtraStruct> list = c857470XkP.LIZ.LLJJIJIL.creativeModel.postPageModel.transientExtra;
            if (!C086I.LIZIZ(list) && z2) {
                arrayList.addAll(0, list);
            }
            C858780XmW.LIZ(arrayList, z2);
        }
        return arrayList;
    }
}
