package X;

/* JADX INFO: renamed from: X.0wyt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1801530wyt extends AbstractC1801490wyp {
    @Override // X.AbstractC1549150qPp
    public final boolean shouldUseOriginalData(InterfaceC634840OvC interfaceC634840OvC) {
        EnumC1063300dmC enumC1063300dmC;
        C1543410qGZ c1543410qGZLIZJ;
        C1543190qGD c1543190qGD;
        if (interfaceC634840OvC != null && (c1543410qGZLIZJ = interfaceC634840OvC.LIZJ()) != null && (c1543190qGD = c1543410qGZLIZJ.LIZ.LIZ) != null) {
            enumC1063300dmC = c1543190qGD.LJIILJJIL;
        } else {
            enumC1063300dmC = null;
        }
        if (enumC1063300dmC == EnumC1063300dmC.WEB) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0085  */
    @Override // X.AbstractC1549150qPp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void handle(com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel r9, com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock r10, X.EnumC1063300dmC r11) {
        /*
            r8 = this;
            X.0wys r9 = (X.InterfaceC1801520wys) r9
            java.lang.Boolean r0 = r9.getShowTop()
            r2 = 0
            if (r0 == 0) goto Lb0
            boolean r7 = r0.booleanValue()
        Ld:
            X.0OvC r0 = r8.IBridgeSdkContext
            r3 = 0
            if (r0 == 0) goto Lad
            android.view.View r6 = r0.getView()
        L16:
            X.0OvC r0 = r8.IBridgeSdkContext
            if (r0 == 0) goto Laa
            android.app.Activity r5 = r0.LIZLLL()
        L1e:
            X.0OvC r0 = r8.IBridgeSdkContext
            if (r0 == 0) goto La7
            android.content.Context r1 = r0.getContext()
        L26:
            if (r6 == 0) goto Lb3
            if (r5 == 0) goto Lb3
            if (r1 == 0) goto Lb3
            java.lang.String r2 = r9.getType()
            java.lang.String r0 = "info"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r0)
            if (r0 == 0) goto L99
            r4 = 2130975627(0x7f041b8b, float:1.756011E38)
        L3b:
            r2 = 1
            if (r4 != 0) goto L70
            if (r7 != 0) goto L7e
            java.lang.Number r0 = r9.getPosition()
            if (r0 == 0) goto L68
            int r0 = r0.intValue()
            if (r0 != r2) goto L68
            java.lang.String r0 = r9.getText()
            X.C766270U4b.LJIIJJI(r0)
        L53:
            java.lang.Class<X.0wyq> r0 = X.InterfaceC1801500wyq.class
            com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel r1 = X.C1909107dp.LIZJ(r0, r3)
            X.0wyq r1 = (X.InterfaceC1801500wyq) r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r1.setCode(r0)
            java.lang.String r0 = ""
            r10.onSuccess(r1, r0)
            return
        L68:
            java.lang.String r0 = r9.getText()
            X.C766270U4b.LJIIIZ(r1, r0)
            goto L53
        L70:
            if (r7 != 0) goto L7e
            java.lang.Number r0 = r9.getPosition()
            if (r0 == 0) goto L93
            int r0 = r0.intValue()
            if (r0 != r2) goto L93
        L7e:
            X.0mGx r1 = new X.0mGx
            r1.<init>(r6)
        L83:
            if (r4 == 0) goto L88
            r1.LJFF(r4)
        L88:
            java.lang.String r0 = r9.getText()
            r1.LJIIJ(r0)
            r1.LJIIJJI()
            goto L53
        L93:
            X.0mGx r1 = new X.0mGx
            r1.<init>(r5)
            goto L83
        L99:
            java.lang.String r0 = "warn"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r0)
            if (r0 == 0) goto La5
            r4 = 2130975568(0x7f041b50, float:1.755999E38)
            goto L3b
        La5:
            r4 = 0
            goto L3b
        La7:
            r1 = r3
            goto L26
        Laa:
            r5 = r3
            goto L1e
        Lad:
            r6 = r3
            goto L16
        Lb0:
            r7 = 0
            goto Ld
        Lb3:
            java.lang.String r1 = "context is null"
            r0 = 4
            X.C2382909Vj.LIZ(r10, r2, r1, r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1801530wyt.handle(com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel, com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock, X.0dmC):void");
    }
}
