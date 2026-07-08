package X;

import android.content.res.Resources;
import android.view.View;
import com.ss.android.ugc.aweme.addyours.model.UserInvitee;
import com.ss.android.ugc.tiktok.addyours.service.AddYoursInviteBehavior;
import java.util.List;

/* JADX INFO: renamed from: X.0Det, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C344450Det extends AddYoursInviteBehavior {
    @Override // com.ss.android.ugc.tiktok.addyours.service.AddYoursInviteBehavior, X.InterfaceC330080Cwo
    public void onSelectionChange(List<UserInvitee> list, View view) {
        C197039127h c197039127h;
        CharSequence string = null;
        if (view instanceof C197039127h) {
            c197039127h = (C197039127h) view;
        } else {
            c197039127h = null;
        }
        if (list.isEmpty()) {
            if (c197039127h != null) {
                Resources resources = c197039127h.getResources();
                if (resources != null) {
                    string = resources.getText(2131836221);
                }
                c197039127h.setText(string);
                c197039127h.setEnabled(false);
                return;
            }
            return;
        }
        int size = list.size();
        if (c197039127h == null) {
            return;
        }
        Resources resources2 = c197039127h.getResources();
        if (resources2 != null) {
            string = resources2.getString(2131825079, Integer.valueOf(size));
        }
        c197039127h.setText(string);
        c197039127h.setEnabled(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00a0  */
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
    @Override // com.ss.android.ugc.tiktok.addyours.service.AddYoursInviteBehavior, X.InterfaceC330080Cwo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object onSelected(androidx.fragment.app.Fragment r13, java.util.List<com.ss.android.ugc.aweme.addyours.model.UserInvitee> r14, java.util.List<com.ss.android.ugc.aweme.addyours.model.UserInvitee> r15, X.InterfaceC1364105Vn<? super kotlin.Unit> r16) {
        /*
            r12 = this;
            r3 = r16
            boolean r0 = r3 instanceof X.C344460Deu
            if (r0 == 0) goto La0
            r11 = r3
            X.0Deu r11 = (X.C344460Deu) r11
            int r2 = r11.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto La0
            int r2 = r2 - r1
            r11.LLILZ = r2
        L14:
            java.lang.Object r1 = r11.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r11.LLILZ
            r2 = 0
            r4 = 1
            if (r0 == 0) goto L3d
            if (r0 != r4) goto La7
            java.lang.Object r14 = r11.LL
            java.util.List r14 = (java.util.List) r14
            X.C155000ia.LIZIZ(r1)
        L29:
            int r0 = r14.size()
            X.03Hh r4 = X.C817503Hh.LL
            X.08ps r3 = X.C2108208Ns.LIZ
            X.0Der r1 = new X.0Der
            r1.<init>(r0, r2)
            r0 = 2
            X.C23250099c.LIZLLL(r4, r3, r2, r1, r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L3d:
            X.C155000ia.LIZIZ(r1)
            java.util.Map r1 = r12.LIZ()
            java.lang.String r0 = "topic_id"
            java.lang.Object r1 = r1.get(r0)
            boolean r0 = r1 instanceof java.lang.Long
            if (r0 == 0) goto Laf
            java.lang.Long r1 = (java.lang.Long) r1
            if (r1 == 0) goto Laf
            long r7 = r1.longValue()
            java.util.Map r1 = r12.LIZ()
            java.lang.String r0 = "aweme"
            java.lang.Object r5 = r1.get(r0)
            boolean r0 = r5 instanceof com.ss.android.ugc.aweme.feed.model.Aweme
            if (r0 == 0) goto L8b
            com.ss.android.ugc.aweme.feed.model.Aweme r5 = (com.ss.android.ugc.aweme.feed.model.Aweme) r5
        L66:
            X.11uW r6 = X.C19651011uW.LIZIZ
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r1 = r14.iterator()
        L71:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L8d
            java.lang.Object r0 = r1.next()
            com.ss.android.ugc.aweme.addyours.model.UserInvitee r0 = (com.ss.android.ugc.aweme.addyours.model.UserInvitee) r0
            java.lang.String r0 = r0.getUid()
            java.lang.Long r0 = X.C2095008Iq.LJIILIIL(r0)
            if (r0 == 0) goto L71
            r10.add(r0)
            goto L71
        L8b:
            r5 = r2
            goto L66
        L8d:
            if (r5 == 0) goto L9e
            java.lang.String r9 = r5.getAid()
        L93:
            r11.LL = r14
            r11.LLILZ = r4
            java.lang.Object r0 = r6.LIZJ(r7, r9, r10, r11)
            if (r0 != r3) goto L29
            return r3
        L9e:
            r9 = r2
            goto L93
        La0:
            X.0Deu r11 = new X.0Deu
            r11.<init>(r12, r3)
            goto L14
        La7:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        Laf:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C344450Det.onSelected(androidx.fragment.app.Fragment, java.util.List, java.util.List, X.05Vn):java.lang.Object");
    }
}
