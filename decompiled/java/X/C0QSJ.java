package X;

import java.util.List;

/* JADX INFO: renamed from: X.0QSJ, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public interface C0QSJ {
    void bindAbility(Object obj, Class<?> cls);

    Object getAbility(Class<?> cls);

    List<Class<Object>> getScopes();

    void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ);

    void unbindAbility(Object obj, Class<?> cls);

    void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ);
}
