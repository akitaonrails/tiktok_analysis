package X;

import android.view.MotionEvent;
import android.view.View;
import com.ss.android.ugc.aweme.im.chatroom.input.components.record.RecordBtnAssem;

/* JADX INFO: renamed from: X.0H1o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C434380H1o extends C21648719nx {
    public boolean LL;
    public final /* synthetic */ C817403Hg LLILLJJLI;
    public final /* synthetic */ C817403Hg LLILLL;
    public final /* synthetic */ C817403Hg LLILZ;
    public final /* synthetic */ C817403Hg LLILZIL;
    public final /* synthetic */ View LLILZLL;
    public final /* synthetic */ RecordBtnAssem LLIZ;

    @Override // X.C21648719nx, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        this.LLILLJJLI.element = motionEvent.getX();
        this.LLILLL.element = motionEvent.getY();
        this.LLILZ.element = 0.0f;
        this.LLILZIL.element = 0.0f;
        this.LL = false;
        return true;
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
    @Override // X.C21648719nx, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        this.LL = true;
        RecordBtnAssem recordBtnAssem = this.LLIZ;
        ((C434390H1p) recordBtnAssem.hp(recordBtnAssem)).LIZIZ.invoke(this.LLILZLL);
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
    @Override // X.C21648719nx, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        if (C298300Bme.LIZ()) {
            this.LLILZLL.performHapticFeedback(3);
        }
        RecordBtnAssem recordBtnAssem = this.LLIZ;
        ((C434390H1p) recordBtnAssem.hp(recordBtnAssem)).LIZ.invoke(this.LLILZLL);
        return true;
    }

    public C434380H1o(C817403Hg c817403Hg, C817403Hg c817403Hg2, C817403Hg c817403Hg3, C817403Hg c817403Hg4, View view, RecordBtnAssem recordBtnAssem) {
        this.LLILLJJLI = c817403Hg;
        this.LLILLL = c817403Hg2;
        this.LLILZ = c817403Hg3;
        this.LLILZIL = c817403Hg4;
        this.LLILZLL = view;
        this.LLIZ = recordBtnAssem;
    }
}
