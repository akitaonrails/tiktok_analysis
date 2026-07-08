package X;

import X.C830490Whz;
import android.text.TextUtils;
import com.google.android.gms.common.ConnectionResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: X.0Wg3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C829290Wg3 {
    public int LIZLLL;
    public final C830490Whz<C831420WjU<?>, String> LIZIZ = new C830490Whz<>();
    public final C835520Wq6<Map<C831420WjU<?>, String>> LIZJ = new C835520Wq6<>();
    public boolean LJ = false;
    public final C830490Whz<C831420WjU<?>, ConnectionResult> LIZ = new C830490Whz<>();

    public C829290Wg3(Iterable<? extends InterfaceC829320Wg6<?>> iterable) {
        Iterator it2 = ((ArrayList) iterable).iterator();
        while (it2.hasNext()) {
            this.LIZ.put(((InterfaceC829320Wg6) it2.next()).getApiKey(), null);
        }
        this.LIZLLL = C830490Whz.this.LLILLL;
    }

    public final void LIZ(C831420WjU<?> c831420WjU, ConnectionResult connectionResult, String str) {
        this.LIZ.put(c831420WjU, connectionResult);
        this.LIZIZ.put(c831420WjU, str);
        this.LIZLLL--;
        if (!connectionResult.LLFFF()) {
            this.LJ = true;
        }
        if (this.LIZLLL == 0) {
            if (this.LJ) {
                final C830490Whz<C831420WjU<?>, ConnectionResult> c830490Whz = this.LIZ;
                this.LIZJ.LIZ(new Exception(c830490Whz) { // from class: X.0Wg5
                    public final C830490Whz<C831420WjU<?>, ConnectionResult> LL;

                    @Override // java.lang.Throwable
                    public String getMessage() {
                        ArrayList arrayList = new ArrayList();
                        Iterator it2 = ((C830490Whz.c) this.LL.keySet()).iterator();
                        boolean z = true;
                        while (true) {
                            AbstractC1322040kVW abstractC1322040kVW = (AbstractC1322040kVW) it2;
                            if (!abstractC1322040kVW.hasNext()) {
                                break;
                            }
                            C831420WjU<?> c831420WjU2 = (C831420WjU) abstractC1322040kVW.next();
                            ConnectionResult connectionResult2 = this.LL.get(c831420WjU2);
                            C0W3J.LJIIIIZZ(connectionResult2);
                            z &= !connectionResult2.LLFFF();
                            String str2 = c831420WjU2.LIZIZ.LIZJ;
                            String strValueOf = String.valueOf(connectionResult2);
                            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 2 + strValueOf.length());
                            sb.append(str2);
                            sb.append(": ");
                            sb.append(strValueOf);
                            arrayList.add(sb.toString());
                        }
                        StringBuilder sb2 = new StringBuilder();
                        if (z) {
                            sb2.append("None of the queried APIs are available. ");
                        } else {
                            sb2.append("Some of the queried APIs are unavailable. ");
                        }
                        sb2.append(TextUtils.join("; ", arrayList));
                        return sb2.toString();
                    }

                    {
                        this.LL = c830490Whz;
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
                    public ConnectionResult getConnectionResult(InterfaceC829320Wg6<? extends InterfaceC833080WmA> interfaceC829320Wg6) {
                        boolean z;
                        C831420WjU<O> apiKey = interfaceC829320Wg6.getApiKey();
                        if (this.LL.get(apiKey) != null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        String str2 = apiKey.LIZIZ.LIZJ;
                        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 58);
                        sb.append("The given API (");
                        sb.append(str2);
                        sb.append(") was not part of the availability request.");
                        C0W3J.LIZ(sb.toString(), z);
                        ConnectionResult connectionResult2 = (ConnectionResult) this.LL.get(apiKey);
                        C0W3J.LJIIIIZZ(connectionResult2);
                        return connectionResult2;
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
                    public ConnectionResult getConnectionResult(AbstractC831380WjQ<? extends InterfaceC833080WmA> abstractC831380WjQ) {
                        boolean z;
                        C831420WjU<O> apiKey = abstractC831380WjQ.getApiKey();
                        if (this.LL.get(apiKey) != null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        String str2 = apiKey.LIZIZ.LIZJ;
                        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 58);
                        sb.append("The given API (");
                        sb.append(str2);
                        sb.append(") was not part of the availability request.");
                        C0W3J.LIZ(sb.toString(), z);
                        ConnectionResult connectionResult2 = (ConnectionResult) this.LL.get(apiKey);
                        C0W3J.LJIIIIZZ(connectionResult2);
                        return connectionResult2;
                    }
                });
                return;
            }
            this.LIZJ.LIZIZ(this.LIZIZ);
        }
    }
}
