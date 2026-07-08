package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.15gA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class EnumC20581215gA {
    public static final C20581115g9 Companion;
    public static final EnumC20581215gA EVERYONE;
    public static final EnumC20581215gA FRIENDS;
    public static final /* synthetic */ EnumC20581215gA[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC20581215gA ONLY_YOU;
    public final int LL;

    public static InterfaceC2044707zh<EnumC20581215gA> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.15g9] */
    static {
        EnumC20581215gA enumC20581215gA = new EnumC20581215gA("EVERYONE", 0, 0);
        EVERYONE = enumC20581215gA;
        EnumC20581215gA enumC20581215gA2 = new EnumC20581215gA("FRIENDS", 1, 2);
        FRIENDS = enumC20581215gA2;
        EnumC20581215gA enumC20581215gA3 = new EnumC20581215gA("ONLY_YOU", 2, 1);
        ONLY_YOU = enumC20581215gA3;
        EnumC20581215gA[] enumC20581215gAArr = {enumC20581215gA, enumC20581215gA2, enumC20581215gA3};
        LLILLJJLI = enumC20581215gAArr;
        LLILLL = new C2254308sP(enumC20581215gAArr);
        Companion = new Object() { // from class: X.15g9
        };
    }

    public static EnumC20581215gA[] values() {
        return (EnumC20581215gA[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC20581215gA valueOf(String str) {
        return (EnumC20581215gA) C08FF.LIZ(EnumC20581215gA.class, str);
    }

    public EnumC20581215gA(String str, int i, int i2) {
        this.LL = i2;
    }
}
