package X;

import X.AbstractC1066304Ez;
import X.AbstractC1764350w0v;
import X.C1764410w11;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.container.vh.AbsCardVH;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* JADX INFO: renamed from: X.0w13, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public abstract class AbstractC1764430w13<VO extends AbstractC1066304Ez, VM extends AbstractC1764350w0v<VO, MO>, MO extends C1764410w11<VO>> {
    public final InterfaceC665370Q7z LIZ;
    public final Class<VO> LIZIZ;
    public final Class<VM> LIZJ;

    public abstract MO LIZ(InterfaceC665370Q7z interfaceC665370Q7z, VO vo, C04FN c04fn);

    public abstract AbsCardVH LIZIZ(ViewGroup viewGroup);

    public abstract VM LIZJ(InterfaceC665370Q7z interfaceC665370Q7z, VO vo, C04FN c04fn);

    public AbstractC1764430w13(InterfaceC665370Q7z interfaceC665370Q7z) {
        Type type;
        Class<VO> cls;
        Type type2;
        ParameterizedType parameterizedType;
        Type[] actualTypeArguments;
        ParameterizedType parameterizedType2;
        Type[] actualTypeArguments2;
        this.LIZ = interfaceC665370Q7z;
        Type genericSuperclass = getClass().getGenericSuperclass();
        if ((genericSuperclass instanceof ParameterizedType) && (parameterizedType2 = (ParameterizedType) genericSuperclass) != null && (actualTypeArguments2 = parameterizedType2.getActualTypeArguments()) != null) {
            type = (Type) C13LQ.LJJIIZ(0, actualTypeArguments2);
        } else {
            type = null;
        }
        if (type instanceof Class) {
            cls = (Class) type;
        } else {
            cls = null;
        }
        this.LIZIZ = cls;
        Type genericSuperclass2 = getClass().getGenericSuperclass();
        if ((genericSuperclass2 instanceof ParameterizedType) && (parameterizedType = (ParameterizedType) genericSuperclass2) != null && (actualTypeArguments = parameterizedType.getActualTypeArguments()) != null) {
            type2 = (Type) C13LQ.LJJIIZ(1, actualTypeArguments);
        } else {
            type2 = null;
        }
        this.LIZJ = type2 instanceof Class ? (Class) type2 : null;
    }
}
