package X;

import java.util.HashSet;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1AXJ, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AXJ extends C09AY implements Function0<HashSet<Pair<? extends EnumC918810a19, ? extends EnumC918810a19>>> {
    public C1AXJ() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final HashSet<Pair<? extends EnumC918810a19, ? extends EnumC918810a19>> invoke() {
        HashSet<Pair<? extends EnumC918810a19, ? extends EnumC918810a19>> hashSet = new HashSet<>();
        EnumC918810a19 enumC918810a19 = EnumC918810a19.StateIdle;
        hashSet.add(new Pair<>(enumC918810a19, enumC918810a19));
        EnumC918810a19 enumC918810a192 = EnumC918810a19.StateInit;
        hashSet.add(new Pair<>(enumC918810a192, enumC918810a192));
        EnumC918810a19 enumC918810a193 = EnumC918810a19.StateJoined;
        hashSet.add(new Pair<>(enumC918810a193, enumC918810a193));
        EnumC918810a19 enumC918810a194 = EnumC918810a19.StateLinked;
        hashSet.add(new Pair<>(enumC918810a194, enumC918810a194));
        hashSet.add(new Pair<>(enumC918810a192, enumC918810a19));
        hashSet.add(new Pair<>(enumC918810a19, enumC918810a192));
        hashSet.add(new Pair<>(enumC918810a192, enumC918810a193));
        hashSet.add(new Pair<>(enumC918810a19, enumC918810a193));
        hashSet.add(new Pair<>(enumC918810a192, enumC918810a194));
        hashSet.add(new Pair<>(enumC918810a19, enumC918810a194));
        hashSet.add(new Pair<>(enumC918810a193, enumC918810a194));
        hashSet.add(new Pair<>(enumC918810a194, enumC918810a19));
        hashSet.add(new Pair<>(enumC918810a194, enumC918810a192));
        return hashSet;
    }
}
