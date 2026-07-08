package X;

import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.ugc.aweme.creation.base.MusicResModel;

/* JADX INFO: renamed from: X.0MhA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C575180MhA implements InterfaceC575170Mh9<MusicResModel, AVMusic> {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007e  */
    /* JADX WARN: Type inference failed for: r0v9, types: [X.0MTh] */
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
    @Override // X.InterfaceC575170Mh9
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(com.ss.ugc.aweme.creation.base.MusicResModel r10, X.C569090MTr r11, X.InterfaceC1364105Vn r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof X.C575190MhB
            if (r0 == 0) goto L7e
            r7 = r12
            X.0MhB r7 = (X.C575190MhB) r7
            int r2 = r7.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L7e
            int r2 = r2 - r1
            r7.LLILLL = r2
        L12:
            java.lang.Object r2 = r7.LL
            java.lang.Object r8 = X.C099R.LJFF()
            int r0 = r7.LLILLL
            r6 = 0
            r1 = 1
            if (r0 == 0) goto L26
            if (r0 != r1) goto L8c
            X.C155000ia.LIZIZ(r2)
        L23:
            if (r2 == 0) goto L84
            return r2
        L26:
            X.C155000ia.LIZIZ(r2)
            java.lang.String r0 = r10.getMusicId()
            if (r0 == 0) goto L9c
            int r0 = r0.length()
            if (r0 == 0) goto L9c
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel> r0 = com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel.class
            r11.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.Object r5 = r11.get(r0)
            if (r5 == 0) goto L94
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r5 = (com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel) r5
            r7.getClass()
            r7.getClass()
            r7.LLILLL = r1
            X.1DEt r4 = new X.1DEt
            X.05Vn r0 = X.C099M.LIZLLL(r7)
            r4.<init>(r1, r0)
            r4.LJIJJ()
            com.ss.android.ugc.aweme.port.in.IAnotherMusicService r3 = lth.o.LJI
            android.app.Application r0 = X.C0CHQ.LIZ
            android.content.Context r2 = X.C786410Ut5.M3(r0)
            java.lang.String r1 = r10.getMusicId()
            X.0MTh r0 = new X.0MTh
            r0.<init>()
            r3.fl(r2, r1, r0)
            java.lang.Object r2 = r4.LJIJ()
            java.lang.Object r0 = X.C099R.LJFF()
            if (r2 != r0) goto L7b
            X.C099Q.LIZJ(r7)
        L7b:
            if (r2 != r8) goto L23
            return r8
        L7e:
            X.0MhB r7 = new X.0MhB
            r7.<init>(r9, r12)
            goto L12
        L84:
            X.0MTS r1 = new X.0MTS
            java.lang.String r0 = "MusicResModelParser Failed"
            r1.<init>(r0, r6)
            throw r1
        L8c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L94:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel"
            r1.<init>(r0)
            throw r1
        L9c:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C575180MhA.LIZ(com.ss.ugc.aweme.creation.base.MusicResModel, X.0MTr, X.05Vn):java.lang.Object");
    }
}
