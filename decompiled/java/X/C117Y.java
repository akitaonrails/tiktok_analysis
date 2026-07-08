package X;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.sticker.data.HashtagStruct;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS430S0200000_29;

/* JADX INFO: renamed from: X.117Y, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C117Y implements C0FLT {
    public final VideoPublishEditModel LIZ;
    public final ViewModelStoreOwner LIZIZ;
    public final Scene LIZJ;
    public final C01GW LIZLLL;

    public final C117W LJFF() {
        return (C117W) this.LIZLLL.getValue();
    }

    @Override // X.C0FLT
    public final void LIZLLL() {
        C425240Glu c425240Glu = LJFF().LL;
        if (c425240Glu == null) {
            c425240Glu = null;
        }
        c425240Glu.setHorizontalFadingEdgeEnabled(true);
        c425240Glu.setVerticalFadingEdgeEnabled(true);
        c425240Glu.setFadingEdgeLength(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)));
    }

    @Override // X.C0FLT
    public final void LJ() {
        LJFF().setItemBackgroundColor(R.attr.e4);
    }

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
    @Override // X.C0FLT
    public final void LIZ(String str) {
        boolean z;
        C117W c117wLJFF = LJFF();
        if (c117wLJFF.LLILZIL && c117wLJFF.LLILZ != null) {
            c117wLJFF.M5();
            if (str != null && str.length() != 0) {
                z = false;
            } else {
                z = true;
            }
            C194495117l c194495117l = null;
            C1445580nim c1445580nim = null;
            if (z) {
                C194497117n c194497117n = c117wLJFF.LLJI;
                if (c194497117n == null) {
                    c194497117n = null;
                }
                C1445580nim c1445580nim2 = c117wLJFF.LLILZ;
                if (c1445580nim2 != null) {
                    c1445580nim = c1445580nim2;
                }
                c194497117n.LIZ.vQ2(c1445580nim);
                return;
            }
            C194495117l c194495117l2 = c117wLJFF.LLJIJIL;
            if (c194495117l2 != null) {
                c194495117l = c194495117l2;
            }
            c194495117l.LIZ.LIZJ(str, "challenge_create");
        }
    }

    @Override // X.C0FLT
    public final void LIZIZ(int i) {
        C786410Ut5.E0(LJFF(), i);
        if (i == 0) {
            C117W c117wLJFF = LJFF();
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c117wLJFF);
            c117wLJFF.setAlpha(1.0f);
        }
    }

    @Override // X.C0FLT
    public final void LIZJ(ViewGroup viewGroup, final Function1 function1, final Function1 function12) {
        LJFF().setOnHashTagItemClickListener(new InterfaceC194490117g<C117V>() { // from class: X.117b
            @Override // X.InterfaceC194490117g
            public final void LIZ(C117V c117v) {
                String str;
                AVChallenge aVChallenge;
                Function1<HashtagStruct, Unit> function13 = function1;
                HashtagStruct hashtagStruct = new HashtagStruct();
                if (c117v != null && (aVChallenge = c117v.LIZ) != null) {
                    str = aVChallenge.challengeName;
                } else {
                    str = null;
                }
                hashtagStruct.setHashtagName(str);
                function13.invoke(hashtagStruct);
            }

            @Override // X.InterfaceC194490117g
            public final void LIZIZ(C117V c117v) {
                String str;
                AVChallenge aVChallenge;
                Function1<HashtagStruct, Unit> function13 = function12;
                HashtagStruct hashtagStruct = new HashtagStruct();
                if (c117v != null && (aVChallenge = c117v.LIZ) != null) {
                    str = aVChallenge.challengeName;
                } else {
                    str = null;
                }
                hashtagStruct.setHashtagName(str);
                function13.invoke(hashtagStruct);
            }
        });
        if (viewGroup != null) {
            viewGroup.addView(LJFF(), new FrameLayout.LayoutParams(-1, -2, 80));
        }
        LJFF().LLILZ = C1445570nil.LIZ(this.LIZ);
    }

    public C117Y(Context context, VideoPublishEditModel videoPublishEditModel, ViewModelStoreOwner viewModelStoreOwner, Scene scene) {
        this.LIZ = videoPublishEditModel;
        this.LIZIZ = viewModelStoreOwner;
        this.LIZJ = scene;
        this.LIZLLL = C452501pT.LIZIZ(new AwS430S0200000_29(this, context, 52));
    }
}
