package Y;

import com.bytedance.live.render.engine.alphaplayer.player.TTMultiplePlayerImpl;
import com.bytedance.live.render.engine.alphaplayer.player.TTMultiplePlayerImplV2;

/* JADX INFO: loaded from: classes24.dex */
public class ARunnableS2S1102000_23 implements Runnable {
    public final int $t;
    public int i2 = -1;
    public int i3;
    public Object l1;
    public String s0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

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
    /*  JADX ERROR: JadxRuntimeException in pass: FinishTypeInference
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r5v2 boolean
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.lambda$visit$0(FinishTypeInference.java:27)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.visit(FinishTypeInference.java:22)
        */
    public static final void run$0(Y.ARunnableS2S1102000_23 r6) {
        /*
            java.lang.Object r5 = r6.l1
            com.bytedance.live.render.engine.alphaplayer.player.TTMultiplePlayerImpl r5 = (com.bytedance.live.render.engine.alphaplayer.player.TTMultiplePlayerImpl) r5
            int r4 = r6.i2
            int r3 = r6.i3
            java.lang.String r2 = r6.s0
            r5.getClass()
            java.lang.String r1 = "TTMultiplePlayerImpl@7584.notifyError$1L"
            X.C1C7U.LIZ(r1)
            com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer$OnErrorListener<com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer<T extends com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer>> r0 = r5.errorListener
            r0.onError(r5, r4, r3, r2)
            X.C1C7U.LIZIZ(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS2S1102000_23.run$0(Y.ARunnableS2S1102000_23):void");
    }

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
    /*  JADX ERROR: JadxRuntimeException in pass: FinishTypeInference
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r4v2 boolean
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.lambda$visit$0(FinishTypeInference.java:27)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.visit(FinishTypeInference.java:22)
        */
    public static final void run$1(Y.ARunnableS2S1102000_23 r6) {
        /*
            java.lang.String r5 = "TTMultiplePlayerImplV2@1a58.notifyError$1"
            X.C1C7U.LIZ(r5)
            java.lang.Object r4 = r6.l1     // Catch: java.lang.Throwable -> L17
            com.bytedance.live.render.engine.alphaplayer.player.TTMultiplePlayerImplV2 r4 = (com.bytedance.live.render.engine.alphaplayer.player.TTMultiplePlayerImplV2) r4     // Catch: java.lang.Throwable -> L17
            com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer$OnErrorListener<com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer<T extends com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer>> r3 = r4.errorListener     // Catch: java.lang.Throwable -> L17
            if (r3 == 0) goto L22
            int r2 = r6.i2     // Catch: java.lang.Throwable -> L17
            int r1 = r6.i3     // Catch: java.lang.Throwable -> L17
            java.lang.String r0 = r6.s0     // Catch: java.lang.Throwable -> L17
            r3.onError(r4, r2, r1, r0)     // Catch: java.lang.Throwable -> L17
            goto L22
        L17:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            boolean r0 = X.C2179971ATj.LIZ(r1)
            if (r0 != 0) goto L22
            throw r1
        L22:
            X.C1C7U.LIZIZ(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS2S1102000_23.run$1(Y.ARunnableS2S1102000_23):void");
    }

    public ARunnableS2S1102000_23(TTMultiplePlayerImpl tTMultiplePlayerImpl, int i, String str, int i2) {
        this.$t = i2;
        this.l1 = tTMultiplePlayerImpl;
        this.i3 = i;
        this.s0 = str;
    }

    public ARunnableS2S1102000_23(TTMultiplePlayerImplV2 tTMultiplePlayerImplV2, int i, String str, int i2) {
        this.$t = i2;
        this.l1 = tTMultiplePlayerImplV2;
        this.i3 = i;
        this.s0 = str;
    }
}
