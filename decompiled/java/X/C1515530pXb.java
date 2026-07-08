package X;

import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* JADX INFO: renamed from: X.0pXb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1515530pXb implements InterfaceC1501660pBE<TypedInput, C1515820pY4<C1515830pY5>> {
    public final C1515520pXa LIZ;

    public C1515530pXb(ParameterizedType parameterizedType) {
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (actualTypeArguments.length >= 1) {
            Type type = actualTypeArguments[0];
            if (type instanceof ParameterizedType) {
                Type[] actualTypeArguments2 = ((ParameterizedType) type).getActualTypeArguments();
                if (actualTypeArguments2.length < 2) {
                    return;
                }
                this.LIZ = new C1515520pXa(ProtoAdapter.get((Class) actualTypeArguments2[0]));
            }
        }
    }

    @Override // X.InterfaceC1501660pBE
    public final C1515820pY4<C1515830pY5> LIZ(TypedInput typedInput) {
        C1515670pXp c1515670pXp = new C1515670pXp(typedInput.in(), 0);
        C1507100pK0.LJI().getClass();
        final C1515820pY4<byte[]> c1515820pY4LIZ = c1515670pXp.LIZ();
        return c1515820pY4LIZ.LIZJ(new InterfaceC1515570pXf() { // from class: X.0pXc
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // X.InterfaceC1515570pXf
            public final Object apply(Object obj) {
                Message message;
                C1515830pY5 c1515830pY5;
                C1515530pXb c1515530pXb = this.LIZ;
                C1515820pY4 c1515820pY4 = c1515820pY4LIZ;
                byte[] bArr = (byte[]) obj;
                c1515530pXb.getClass();
                C1515830pY5 c1515830pY52 = null;
                try {
                    System.currentTimeMillis();
                    C1515520pXa c1515520pXa = c1515530pXb.LIZ;
                    c1515520pXa.getClass();
                    try {
                        message = (Message) c1515520pXa.LIZ.decode(bArr);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        message = null;
                    }
                    c1515830pY5 = new C1515830pY5(message);
                } catch (Throwable th2) {
                    th = th2;
                }
                try {
                    c1515830pY5.LLILLJJLI = c1515820pY4.getRequestInfo();
                    c1515830pY5.LLILLL = c1515820pY4.LLILLL;
                    System.currentTimeMillis();
                    return c1515830pY5;
                } catch (Throwable th3) {
                    th = th3;
                    c1515830pY52 = c1515830pY5;
                    TryCatchGuardChecker.doCheck(th);
                    return c1515830pY52;
                }
            }
        });
    }
}
