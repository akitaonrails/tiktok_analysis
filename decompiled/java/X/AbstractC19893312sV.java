package X;

import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Member;

/* JADX INFO: renamed from: X.12sV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC19893312sV<T, R> implements AnnotatedElement, Member {
    public final AccessibleObject LL;
    public final Member LLILLJJLI;

    @Override // java.lang.reflect.AnnotatedElement
    public final Annotation[] getAnnotations() {
        return this.LL.getAnnotations();
    }

    @Override // java.lang.reflect.AnnotatedElement
    public final Annotation[] getDeclaredAnnotations() {
        return this.LL.getDeclaredAnnotations();
    }

    @Override // java.lang.reflect.Member
    public final Class<? super T> getDeclaringClass() {
        return (Class<? super T>) this.LLILLJJLI.getDeclaringClass();
    }

    @Override // java.lang.reflect.Member
    public final int getModifiers() {
        return this.LLILLJJLI.getModifiers();
    }

    @Override // java.lang.reflect.Member
    public final String getName() {
        return this.LLILLJJLI.getName();
    }

    public final int hashCode() {
        return this.LLILLJJLI.hashCode();
    }

    @Override // java.lang.reflect.Member
    public final boolean isSynthetic() {
        return this.LLILLJJLI.isSynthetic();
    }

    public String toString() {
        return this.LLILLJJLI.toString();
    }

    public AbstractC19891512sD<T> LIZ() {
        return AbstractC19891512sD.of((Class) getDeclaringClass());
    }

    public <M extends AccessibleObject & Member> AbstractC19893312sV(M m) {
        m.getClass();
        this.LL = m;
        this.LLILLJJLI = m;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AbstractC19893312sV)) {
            return false;
        }
        AbstractC19893312sV abstractC19893312sV = (AbstractC19893312sV) obj;
        if (!LIZ().equals(abstractC19893312sV.LIZ()) || !this.LLILLJJLI.equals(abstractC19893312sV.LLILLJJLI)) {
            return false;
        }
        return true;
    }

    @Override // java.lang.reflect.AnnotatedElement
    public final <A extends Annotation> A getAnnotation(Class<A> cls) {
        return (A) this.LL.getAnnotation(cls);
    }

    @Override // java.lang.reflect.AnnotatedElement
    public final boolean isAnnotationPresent(Class<? extends Annotation> cls) {
        return this.LL.isAnnotationPresent(cls);
    }
}
