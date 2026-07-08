package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.comment.event.PinNotice;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS1S1700000_21;
import kotlin.jvm.internal.AwS600S0100000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0l2I, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1342360l2I {
    public static final C1342360l2I LIZ = new C1342360l2I();

    public static void LIZ(final LifecycleOwner lifecycleOwner, final Comment comment, final InterfaceC1342370l2J interfaceC1342370l2J, boolean z, final Aweme aweme, final Function1 function1, final C20600815jK c20600815jK, final Fragment fragment, final String str) {
        String aid;
        interfaceC1342370l2J.LIZLLL(true);
        final MutableLiveData mutableLiveDataLIZIZ = interfaceC1342370l2J.LIZIZ(z);
        if (mutableLiveDataLIZIZ == null) {
            return;
        }
        mutableLiveDataLIZIZ.observe(lifecycleOwner, new Observer<C1342530l2Z>() { // from class: X.0l2Y
            @Override // androidx.lifecycle.Observer
            public final void onChanged(C1342530l2Z c1342530l2Z) {
                PinNotice pinNotice;
                C1340430kzB c1340430kzB;
                C1340430kzB c1340430kzB2;
                Comment comment2;
                C1342530l2Z c1342530l2Z2 = c1342530l2Z;
                EnumC1342540l2a enumC1342540l2a = c1342530l2Z2.LIZ;
                if (enumC1342540l2a == EnumC1342540l2a.SUCCESS) {
                    Comment comment3 = comment;
                    if (comment3 != null) {
                        comment3.setAuthorPin(false);
                        C20600815jK<InterfaceC1891350zJl> c20600815jK2 = c20600815jK;
                        if (c20600815jK2 != null) {
                            for (Object obj : (ArrayList) c20600815jK2.LJII()) {
                                InterfaceC1891350zJl interfaceC1891350zJl = (InterfaceC1891350zJl) obj;
                                String cid = null;
                                if ((interfaceC1891350zJl instanceof C1340430kzB) && (c1340430kzB2 = (C1340430kzB) interfaceC1891350zJl) != null && (comment2 = c1340430kzB2.LLILZIL) != null) {
                                    cid = comment2.getCid();
                                }
                                if (Intrinsics.LJFF(cid, comment3.getCid())) {
                                    if ((obj instanceof C1340430kzB) && (c1340430kzB = (C1340430kzB) obj) != null) {
                                        c20600815jK2.LJIILJJIL(((ArrayList) c20600815jK2.LJII()).indexOf(c1340430kzB), C1340430kzB.LJ(c1340430kzB, C1340410kz9.LIZ(c1340430kzB.LLILZLL, false, false, 0, 0.0f, null, false, false, false, null, null, 16777087)));
                                    }
                                }
                            }
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                    }
                    Comment comment4 = interfaceC1342370l2J.getComment();
                    comment4.setAuthorPin(true);
                    function1.invoke(comment4);
                    interfaceC1342370l2J.LIZ(true);
                    C1389890mGx c1389890mGx = new C1389890mGx(fragment.requireActivity());
                    c1389890mGx.LJIIIZ(2131829200);
                    c1389890mGx.LJIIJJI();
                } else if (enumC1342540l2a == EnumC1342540l2a.FAIL) {
                    C1389890mGx c1389890mGx2 = new C1389890mGx(fragment);
                    c1389890mGx2.LJIIIZ(2131829193);
                    c1389890mGx2.LJIIJJI();
                } else if (enumC1342540l2a == EnumC1342540l2a.LIMIT && (pinNotice = c1342530l2Z2.LIZIZ) != null) {
                    Fragment fragment2 = fragment;
                    InterfaceC1342370l2J interfaceC1342370l2J2 = interfaceC1342370l2J;
                    LifecycleOwner lifecycleOwner2 = lifecycleOwner;
                    Comment comment5 = comment;
                    Aweme aweme2 = aweme;
                    Function1<Comment, Unit> function12 = function1;
                    C20600815jK<InterfaceC1891350zJl> c20600815jK3 = c20600815jK;
                    String str2 = str;
                    int i = pinNotice.type;
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                C1397620mTQ c1397620mTQ = new C1397620mTQ(fragment2.requireActivity());
                                c1397620mTQ.LIZJ(0, pinNotice.unpin, new AwS600S0100000_21(interfaceC1342370l2J2, 370));
                                c1397620mTQ.LIZJ(1, pinNotice.pin, new AwS1S1700000_21(lifecycleOwner2, comment5, interfaceC1342370l2J2, aweme2, function12, c20600815jK3, fragment2, str2, 0));
                                C1397580mTM c1397580mTM = new C1397580mTM(fragment2.requireActivity());
                                c1397580mTM.LIZIZ(pinNotice.body);
                                c1397580mTM.LJIIL = c1397620mTQ;
                                new C1397510mTF(c1397580mTM).LIZLLL();
                                C1350920lG6.LJJJI(interfaceC1342370l2J2.getComment(), "comment_restr_pin_opt_popup_show");
                            }
                        } else {
                            C1389890mGx c1389890mGx3 = new C1389890mGx(fragment2.requireActivity());
                            c1389890mGx3.LJIIJ(pinNotice.body);
                            c1389890mGx3.LJIIJJI();
                            C1350920lG6.LJJJI(interfaceC1342370l2J2.getComment(), "comment_restr_pin_toast_show");
                        }
                    } else {
                        C1397620mTQ c1397620mTQ2 = new C1397620mTQ(fragment2.requireActivity());
                        c1397620mTQ2.LJFF(2131821883, new AwS600S0100000_21(interfaceC1342370l2J2, 369));
                        C1397580mTM c1397580mTM2 = new C1397580mTM(fragment2.requireActivity());
                        c1397580mTM2.LIZIZ(pinNotice.body);
                        c1397580mTM2.LJIIL = c1397620mTQ2;
                        new C1397510mTF(c1397580mTM2).LIZLLL();
                        C1350920lG6.LJJJI(interfaceC1342370l2J2.getComment(), "comment_restr_pin_popup_show");
                    }
                }
                interfaceC1342370l2J.LJJJJL();
                mutableLiveDataLIZIZ.removeObserver(this);
            }
        });
        Comment comment2 = interfaceC1342370l2J.getComment();
        String authorUid = null;
        if (aweme != null) {
            authorUid = AwemeExtKt.getAuthorUid(aweme);
        }
        String str2 = "";
        if (authorUid == null) {
            authorUid = "";
        }
        if (aweme != null && (aid = aweme.getAid()) != null) {
            str2 = aid;
        }
        C1350920lG6.LJJJJL(true, comment2, str, authorUid, str2);
    }
}
