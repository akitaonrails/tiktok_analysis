package X;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.design.widget.LiveEditText;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.sharepanel.impl.editshare.fragment.EditShareSelectFragment;
import com.ss.android.ugc.aweme.share.systemshare.SystemShareFragment;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.story.note.StoryThoughtAvatarCreationFragment;
import com.ss.android.ugc.aweme.story.note.StoryThoughtCreationFragment;
import com.ss.android.ugc.aweme.tag.assem.VideoTagHeaderAssem;
import com.ss.android.ugc.aweme.tag.viewmodel.VideoTagSearchListViewModel;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS610S0100000_31;
import kotlin.jvm.internal.AwS70S1000000_19;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.16HQ, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public class C16HQ implements TextWatcher {
    public final int $t;
    public Object l0;

    public static final void afterTextChanged$7(C16HQ c16hq, Editable editable) {
    }

    public static final void afterTextChanged$8(C16HQ c16hq, Editable editable) {
    }

    public static final void beforeTextChanged$0(C16HQ c16hq, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$1(C16HQ c16hq, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$10(C16HQ c16hq, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$11(C16HQ c16hq, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$2(C16HQ c16hq, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$3(C16HQ c16hq, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$4(C16HQ c16hq, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$5(C16HQ c16hq, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$6(C16HQ c16hq, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$7(C16HQ c16hq, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$8(C16HQ c16hq, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$9(C16HQ c16hq, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$0(C16HQ c16hq, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$1(C16HQ c16hq, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$10(C16HQ c16hq, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$11(C16HQ c16hq, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$2(C16HQ c16hq, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$4(C16HQ c16hq, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$5(C16HQ c16hq, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$6(C16HQ c16hq, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$9(C16HQ c16hq, CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        switch (this.$t) {
            case 0:
                afterTextChanged$0(this, editable);
                break;
            case 1:
                afterTextChanged$1(this, editable);
                break;
            case 2:
                afterTextChanged$2(this, editable);
                break;
            case 3:
                afterTextChanged$3(this, editable);
                break;
            case 4:
                afterTextChanged$4(this, editable);
                break;
            case 5:
                afterTextChanged$5(this, editable);
                break;
            case 6:
                afterTextChanged$6(this, editable);
                break;
            case 7:
                afterTextChanged$7(this, editable);
                break;
            case 8:
                afterTextChanged$8(this, editable);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                afterTextChanged$9(this, editable);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                afterTextChanged$10(this, editable);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                afterTextChanged$11(this, editable);
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        switch (this.$t) {
            case 0:
                beforeTextChanged$0(this, charSequence, i, i2, i3);
                break;
            case 1:
                beforeTextChanged$1(this, charSequence, i, i2, i3);
                break;
            case 2:
                beforeTextChanged$2(this, charSequence, i, i2, i3);
                break;
            case 3:
                beforeTextChanged$3(this, charSequence, i, i2, i3);
                break;
            case 4:
                beforeTextChanged$4(this, charSequence, i, i2, i3);
                break;
            case 5:
                beforeTextChanged$5(this, charSequence, i, i2, i3);
                break;
            case 6:
                beforeTextChanged$6(this, charSequence, i, i2, i3);
                break;
            case 7:
                beforeTextChanged$7(this, charSequence, i, i2, i3);
                break;
            case 8:
                beforeTextChanged$8(this, charSequence, i, i2, i3);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                beforeTextChanged$9(this, charSequence, i, i2, i3);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                beforeTextChanged$10(this, charSequence, i, i2, i3);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                beforeTextChanged$11(this, charSequence, i, i2, i3);
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        switch (this.$t) {
            case 0:
                onTextChanged$0(this, charSequence, i, i2, i3);
                break;
            case 1:
                onTextChanged$1(this, charSequence, i, i2, i3);
                break;
            case 2:
                onTextChanged$2(this, charSequence, i, i2, i3);
                break;
            case 3:
                onTextChanged$3(this, charSequence, i, i2, i3);
                break;
            case 4:
                onTextChanged$4(this, charSequence, i, i2, i3);
                break;
            case 5:
                onTextChanged$5(this, charSequence, i, i2, i3);
                break;
            case 6:
                onTextChanged$6(this, charSequence, i, i2, i3);
                break;
            case 7:
                onTextChanged$7(this, charSequence, i, i2, i3);
                break;
            case 8:
                onTextChanged$8(this, charSequence, i, i2, i3);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onTextChanged$9(this, charSequence, i, i2, i3);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onTextChanged$10(this, charSequence, i, i2, i3);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onTextChanged$11(this, charSequence, i, i2, i3);
                break;
        }
    }

    public C16HQ(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void afterTextChanged$0(C16HQ c16hq, Editable editable) {
        C20584715gj.LJIILJJIL((C20584715gj) c16hq.l0, null, false, null, null, 15);
        ((C20584715gj) c16hq.l0).LJIILIIL();
        ((C20584715gj) c16hq.l0).LJIILL();
        C20584715gj c20584715gj = (C20584715gj) c16hq.l0;
        if (c20584715gj.LLJIJIL) {
            c20584715gj.setNewLineReplaceHappened(false);
            Iterator it2 = ((ArrayList) ((C20584715gj) c16hq.l0).LLJI).iterator();
            while (it2.hasNext()) {
                ((Function0) it2.next()).invoke();
            }
        }
    }

    public static final void afterTextChanged$1(C16HQ c16hq, Editable editable) {
        String string;
        if (editable == null || (string = editable.toString()) == null) {
            string = "";
        }
        ((EditShareSelectFragment) c16hq.l0).SR().LJJZZIII(string);
    }

    public static final void afterTextChanged$10(C16HQ c16hq, Editable editable) {
        int length;
        InterfaceC20376314oD interfaceC20376314oD;
        int height = 0;
        if (editable != null) {
            length = editable.length();
        } else {
            length = 0;
        }
        C16F5 c16f5 = ((C20376014oA) c16hq.l0).LLILZ;
        if (c16f5 != null) {
            c16f5.setText(String.valueOf(length));
        }
        C20376014oA c20376014oA = (C20376014oA) c16hq.l0;
        if (!c20376014oA.LLJIJIL) {
            LiveEditText liveEditText = c20376014oA.LLILLL;
            if (c20376014oA.LLJI > 0) {
                if (liveEditText != null) {
                    int height2 = liveEditText.getHeight();
                    C20376014oA c20376014oA2 = (C20376014oA) c16hq.l0;
                    int i = height2 - c20376014oA2.LLJI;
                    c20376014oA2.LLJI = liveEditText.getHeight();
                    if (i != 0 && (interfaceC20376314oD = ((C20376014oA) c16hq.l0).LLJILJIL) != null) {
                        interfaceC20376314oD.LIZ(i);
                        return;
                    }
                    return;
                }
            } else if (liveEditText != null) {
                height = liveEditText.getHeight();
            }
            c20376014oA.LLJI = height;
        }
    }

    public static final void afterTextChanged$11(C16HQ c16hq, Editable editable) {
        int length;
        if (editable != null) {
            length = editable.length();
        } else {
            length = 0;
        }
        C16F5 c16f5 = ((C20375614o6) c16hq.l0).LLILZ;
        if (c16f5 != null) {
            c16f5.setText(String.valueOf(length));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void afterTextChanged$2(X.C16HQ r4, android.text.Editable r5) {
        /*
            java.lang.String r2 = ""
            if (r5 != 0) goto Lb
            boolean r0 = X.C2093608Ic.LJ(r2)
            if (r0 == 0) goto L11
            return
        Lb:
            java.lang.String r1 = r5.toString()
            if (r1 != 0) goto L12
        L11:
            r1 = r2
        L12:
            java.lang.Object r0 = r4.l0
            X.15QK r0 = (X.C15QK) r0
            r0.LLLLLILLIL(r1)
            if (r5 == 0) goto L22
            java.lang.String r0 = r5.toString()
            if (r0 == 0) goto L22
            r2 = r0
        L22:
            java.lang.Object r1 = r4.l0
            X.15QK r1 = (X.C15QK) r1
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r1.LLJJ
            if (r0 != 0) goto L2b
            r0 = 0
        L2b:
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r0.creativeModel
            com.ss.android.ugc.aweme.creative.model.PUgcTemplateData r0 = r0.pugcTemplateData
            r0.templateTitle = r2
            X.0LI2 r0 = r1.LLLJL
            r5 = 1
            if (r0 == 0) goto L39
            r0.Qk(r5)
        L39:
            java.lang.Object r0 = r4.l0
            X.15QK r0 = (X.C15QK) r0
            r0.LLLLLLJ()
            java.lang.Object r4 = r4.l0
            X.15QK r4 = (X.C15QK) r4
            X.0vbG r3 = r4.LLLILZLLLI
            if (r3 == 0) goto L57
            r0 = 2
            android.text.InputFilter[] r2 = new android.text.InputFilter[r0]
            X.15QL r1 = r4.LLLLIILL
            r0 = 0
            r2[r0] = r1
            X.0Xjg r0 = r4.LLLLIIL
            r2[r5] = r0
            r3.setEditTextFilters(r2)
        L57:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16HQ.afterTextChanged$2(X.16HQ, android.text.Editable):void");
    }

    public static final void afterTextChanged$3(C16HQ c16hq, Editable editable) {
        if (editable != null) {
            VideoTagSearchListViewModel videoTagSearchListViewModelJo = ((VideoTagHeaderAssem) c16hq.l0).Jo();
            String string = a0.LJLIIIL(editable.toString()).toString();
            videoTagSearchListViewModelJo.LLILZLL = string;
            videoTagSearchListViewModelJo.setState(new AwS70S1000000_19(string, 32));
        }
    }

    public static final void afterTextChanged$4(C16HQ c16hq, Editable editable) {
        String string;
        boolean z;
        if (editable != null && (string = editable.toString()) != null) {
            if (string.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            long jLongValue = 0;
            if (!z) {
                try {
                    long j = CastLongProtector.parseLong(string);
                    if (j < 0) {
                        ((DialogC20518615Qq) c16hq.l0).LJLIL();
                        return;
                    }
                    if (j > 9223372036854775806L) {
                        ((DialogC20518615Qq) c16hq.l0).LJLIL();
                        return;
                    }
                    DialogC20518615Qq dialogC20518615Qq = (DialogC20518615Qq) c16hq.l0;
                    C1748440vbG c1748440vbG = dialogC20518615Qq.LLJLL;
                    if (c1748440vbG != null) {
                        c1748440vbG.setValidationStatus(0);
                    }
                    C1749190vcT c1749190vcT = dialogC20518615Qq.LLJLILLLLZIIL;
                    if (c1749190vcT != null) {
                        c1749190vcT.LJFF(false);
                    }
                    C16FS c16fs = dialogC20518615Qq.LLJLLIL;
                    if (c16fs != null) {
                        c16fs.setEnabled(true);
                    }
                    DialogC20518615Qq dialogC20518615Qq2 = (DialogC20518615Qq) c16hq.l0;
                    Long lLJJLIL = C500260Jjc.LJJLIL(string);
                    if (lLJJLIL != null) {
                        jLongValue = lLJJLIL.longValue();
                    }
                    dialogC20518615Qq2.LLLFF = jLongValue;
                    return;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    ((DialogC20518615Qq) c16hq.l0).LJLIL();
                    return;
                }
            }
            DialogC20518615Qq dialogC20518615Qq3 = (DialogC20518615Qq) c16hq.l0;
            C1748440vbG c1748440vbG2 = dialogC20518615Qq3.LLJLL;
            if (c1748440vbG2 != null) {
                c1748440vbG2.setValidationStatus(0);
            }
            C1749190vcT c1749190vcT2 = dialogC20518615Qq3.LLJLILLLLZIIL;
            if (c1749190vcT2 != null) {
                c1749190vcT2.LJFF(false);
            }
            C16FS c16fs2 = dialogC20518615Qq3.LLJLLIL;
            if (c16fs2 != null) {
                c16fs2.setEnabled(true);
            }
            ((DialogC20518615Qq) c16hq.l0).LLLFF = 0L;
        }
    }

    public static final void afterTextChanged$5(C16HQ c16hq, Editable editable) {
        ((C20373014ng) c16hq.l0).LIZ.title = editable.toString();
    }

    public static final void afterTextChanged$6(C16HQ c16hq, Editable editable) {
        if (((C20373014ng) c16hq.l0).LIZ.content.isEmpty()) {
            ((C20373014ng) c16hq.l0).LIZ.content.add(editable.toString());
        } else {
            ListProtector.set(((C20373014ng) c16hq.l0).LIZ.content, 0, editable.toString());
        }
    }

    public static final void afterTextChanged$9(C16HQ c16hq, Editable editable) {
        boolean z;
        SystemShareFragment systemShareFragment = (SystemShareFragment) c16hq.l0;
        String strValueOf = String.valueOf(editable);
        systemShareFragment.getClass();
        if (strValueOf.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        InterfaceC20688615xU interfaceC20688615xU = null;
        if (z) {
            systemShareFragment.WR(null, systemShareFragment.LLJIJIL);
            return;
        }
        InterfaceC20688615xU interfaceC20688615xU2 = systemShareFragment.LLJILJIL;
        if (interfaceC20688615xU2 != null) {
            interfaceC20688615xU = interfaceC20688615xU2;
        }
        interfaceC20688615xU.LJJZZIII(strValueOf);
    }

    public static final void onTextChanged$3(C16HQ c16hq, CharSequence charSequence, int i, int i2, int i3) {
        int i4;
        View view = ((VideoTagHeaderAssem) c16hq.l0).LLJIJIL;
        if (view == null) {
            view = null;
        }
        if (charSequence != null && charSequence.length() != 0) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        C786410Ut5.LJLLLLLL(i4, view);
        VideoTagHeaderAssem videoTagHeaderAssem = (VideoTagHeaderAssem) c16hq.l0;
        AwS610S0100000_31 awS610S0100000_31 = new AwS610S0100000_31(charSequence, 242);
        Class<VideoTagHeaderAssem> superclass = VideoTagHeaderAssem.class;
        Class<?>[] interfaces = superclass.getInterfaces();
        ArrayList arrayList = new ArrayList();
        for (Class<?> cls : interfaces) {
            if (InterfaceC724720Sbm.class.isAssignableFrom(cls)) {
                arrayList.add(cls);
            }
        }
        while (arrayList.isEmpty()) {
            superclass = superclass.getSuperclass();
            if (superclass != null) {
                Class<?>[] interfaces2 = superclass.getInterfaces();
                arrayList = new ArrayList();
                for (Class<?> cls2 : interfaces2) {
                    if (InterfaceC724720Sbm.class.isAssignableFrom(cls2)) {
                        arrayList.add(cls2);
                    }
                }
            } else {
                return;
            }
        }
        videoTagHeaderAssem.getSupervisor().LJFF().LJI((Class) C13LP.LJJJJZI(arrayList), awS610S0100000_31);
    }

    public static final void onTextChanged$7(C16HQ c16hq, CharSequence charSequence, int i, int i2, int i3) {
        String string;
        MutableLiveData<String> mutableLiveData = ((StoryThoughtCreationFragment) c16hq.l0).SR().LLIZ;
        if (charSequence == null || (string = charSequence.toString()) == null) {
            string = "";
        }
        mutableLiveData.setValue(string);
    }

    public static final void onTextChanged$8(C16HQ c16hq, CharSequence charSequence, int i, int i2, int i3) {
        String string;
        MutableLiveData<String> mutableLiveData = ((StoryThoughtAvatarCreationFragment) c16hq.l0).WR().LLIZ;
        if (charSequence == null || (string = charSequence.toString()) == null) {
            string = "";
        }
        mutableLiveData.setValue(string);
        ((StoryThoughtAvatarCreationFragment) c16hq.l0).WR().LLLLLLLZIL.setValue(Boolean.TRUE);
    }
}
