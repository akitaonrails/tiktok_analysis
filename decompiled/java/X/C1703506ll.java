package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06ll, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1703506ll extends AbstractC1704206ls implements InterfaceC866850XzX {
    public final AbstractC879060Ye8 LLILLJJLI;
    public final InterfaceC626120Oh8<? super AbstractC1702506lb> LLILLL;

    @Override // X.InterfaceC868050Y3n
    public final int LLLIIII() {
        return 0;
    }

    @Override // X.AbstractC1704206ls
    public final void LIZ() {
        this.LLILLJJLI.LJIILL();
    }

    @Override // X.InterfaceC866850XzX, X.InterfaceC868050Y3n
    public final void LJJJJJL(C0Y8T c0y8t) {
        if (c0y8t != null) {
            this.LLILLL.onNext(new C1702306lZ(c0y8t));
        } else {
            "onDissolveConversation(): conversation is null".toString();
            throw new IllegalStateException("onDissolveConversation(): conversation is null");
        }
    }

    @Override // X.InterfaceC866850XzX, X.InterfaceC868050Y3n
    public final void LJJLIIIJ(final C0Y8T c0y8t) {
        if (c0y8t != null) {
            this.LLILLL.onNext(new AbstractC1702506lb(c0y8t) { // from class: X.06lo
                public final C0Y8T LIZ;

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C1703806lo) && Intrinsics.LJFF(this.LIZ, ((C1703806lo) obj).LIZ);
                }

                public final int hashCode() {
                    return this.LIZ.hashCode();
                }

                public final String toString() {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("OnDeleteConversationEvent(conversation=");
                    sbLIZ.append(this.LIZ);
                    sbLIZ.append(')');
                    return C2188811AlT.LIZIZ(sbLIZ);
                }

                {
                    this.LIZ = c0y8t;
                }
            });
        } else {
            "onDeleteConversation(): conversation is null".toString();
            throw new IllegalStateException("onDeleteConversation(): conversation is null");
        }
    }

    @Override // X.InterfaceC866850XzX, X.InterfaceC868050Y3n
    public final void LJJLJLI(final List<C0YAE> list) {
        InterfaceC626120Oh8<? super AbstractC1702506lb> interfaceC626120Oh8 = this.LLILLL;
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        interfaceC626120Oh8.onNext(new AbstractC1702506lb(list) { // from class: X.06lk
            public final List<C0YAE> LIZ;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1703406lk) && Intrinsics.LJFF(this.LIZ, ((C1703406lk) obj).LIZ);
            }

            public final int hashCode() {
                return this.LIZ.hashCode();
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("OnRemoveMembersEvent(list=");
                sbLIZ.append(this.LIZ);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            {
                this.LIZ = list;
            }
        });
    }

    @Override // X.InterfaceC866850XzX, X.InterfaceC868050Y3n
    public final void LJJLL(final List<C0YAE> list) {
        InterfaceC626120Oh8<? super AbstractC1702506lb> interfaceC626120Oh8 = this.LLILLL;
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        interfaceC626120Oh8.onNext(new AbstractC1702506lb(list) { // from class: X.06lj
            public final List<C0YAE> LIZ;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1703306lj) && Intrinsics.LJFF(this.LIZ, ((C1703306lj) obj).LIZ);
            }

            public final int hashCode() {
                return this.LIZ.hashCode();
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("OnAddMembersEvent(list=");
                sbLIZ.append(this.LIZ);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            {
                this.LIZ = list;
            }
        });
    }

    @Override // X.InterfaceC866850XzX, X.InterfaceC868050Y3n
    public final void LJJZZI(final List<C0YAE> list) {
        InterfaceC626120Oh8<? super AbstractC1702506lb> interfaceC626120Oh8 = this.LLILLL;
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        interfaceC626120Oh8.onNext(new AbstractC1702506lb(list) { // from class: X.06li
            public final List<C0YAE> LIZ;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1703206li) && Intrinsics.LJFF(this.LIZ, ((C1703206li) obj).LIZ);
            }

            public final int hashCode() {
                return this.LIZ.hashCode();
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("OnUpdateMembersEvent(list=");
                sbLIZ.append(this.LIZ);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            {
                this.LIZ = list;
            }
        });
    }

    @Override // X.InterfaceC866850XzX, X.InterfaceC868050Y3n
    public final void LJLILLLLZI(C0Y8T c0y8t) {
        if (c0y8t != null) {
            this.LLILLL.onNext(new C1703706ln(c0y8t));
        } else {
            "onCreateConversation(): conversation is null".toString();
            throw new IllegalStateException("onCreateConversation(): conversation is null");
        }
    }

    @Override // X.InterfaceC866850XzX, X.InterfaceC868050Y3n
    public final void LJLL(C1711306n1 c1711306n1) {
        this.LLILLL.onNext(new C1702706ld(c1711306n1));
    }

    @Override // X.InterfaceC866850XzX, X.InterfaceC868050Y3n
    public final void LJZI(final C0Y8T c0y8t) {
        if (c0y8t != null) {
            this.LLILLL.onNext(new AbstractC1702506lb(c0y8t) { // from class: X.06lp
                public final C0Y8T LIZ;

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C1703906lp) && Intrinsics.LJFF(this.LIZ, ((C1703906lp) obj).LIZ);
                }

                public final int hashCode() {
                    return this.LIZ.hashCode();
                }

                public final String toString() {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("OnLeaveConversationEvent(conversation=");
                    sbLIZ.append(this.LIZ);
                    sbLIZ.append(')');
                    return C2188811AlT.LIZIZ(sbLIZ);
                }

                {
                    this.LIZ = c0y8t;
                }
            });
        } else {
            "onLeaveConversation(): conversation is null".toString();
            throw new IllegalStateException("onLeaveConversation(): conversation is null");
        }
    }

    public C1703506ll(AbstractC879060Ye8 abstractC879060Ye8, InterfaceC626120Oh8<? super AbstractC1702506lb> interfaceC626120Oh8) {
        this.LLILLJJLI = abstractC879060Ye8;
        this.LLILLL = interfaceC626120Oh8;
    }

    @Override // X.InterfaceC866850XzX, X.InterfaceC868050Y3n
    public final void LJLI(final String str, final List<C0YAE> list) {
        InterfaceC626120Oh8<? super AbstractC1702506lb> interfaceC626120Oh8 = this.LLILLL;
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        interfaceC626120Oh8.onNext(new AbstractC1702506lb(str, list) { // from class: X.06lg
            public final String LIZ;
            public final List<C0YAE> LIZIZ;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1703006lg)) {
                    return false;
                }
                C1703006lg c1703006lg = (C1703006lg) obj;
                return Intrinsics.LJFF(this.LIZ, c1703006lg.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1703006lg.LIZIZ);
            }

            public final int hashCode() {
                return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("OnLoadMemberEvent(conversationId=");
                sbLIZ.append(this.LIZ);
                sbLIZ.append(", list=");
                sbLIZ.append(this.LIZIZ);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            {
                this.LIZ = str;
                this.LIZIZ = list;
            }
        });
    }

    @Override // X.InterfaceC866850XzX, X.InterfaceC868050Y3n
    public final void LJLJI(int i, C0Y8T c0y8t) {
        if (c0y8t != null) {
            this.LLILLL.onNext(new C1702406la(i, c0y8t));
        } else {
            "onUpdateConversation(): conversation is null".toString();
            throw new IllegalStateException("onUpdateConversation(): conversation is null");
        }
    }

    @Override // X.InterfaceC866850XzX, X.InterfaceC868050Y3n
    public final void LLIIII(final int i, final String str) {
        if (str != null) {
            this.LLILLL.onNext(new AbstractC1702506lb(str, i) { // from class: X.06lq
                public final String LIZ;
                public final int LIZIZ;

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C1704006lq)) {
                        return false;
                    }
                    C1704006lq c1704006lq = (C1704006lq) obj;
                    return Intrinsics.LJFF(this.LIZ, c1704006lq.LIZ) && this.LIZIZ == c1704006lq.LIZIZ;
                }

                public final int hashCode() {
                    return (this.LIZ.hashCode() * 31) + this.LIZIZ;
                }

                public final String toString() {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("OnSilentConversationEvent(conversationId=");
                    sbLIZ.append(this.LIZ);
                    sbLIZ.append(", status=");
                    sbLIZ.append(this.LIZIZ);
                    sbLIZ.append(')');
                    return C2188811AlT.LIZIZ(sbLIZ);
                }

                {
                    this.LIZ = str;
                    this.LIZIZ = i;
                }
            });
        } else {
            "onSilentConversation(): conversationId is null".toString();
            throw new IllegalStateException("onSilentConversation(): conversationId is null");
        }
    }

    @Override // X.InterfaceC866850XzX, X.InterfaceC868050Y3n
    public final void LLIILZL(final int i, final String str, final List list) {
        if (str != null) {
            InterfaceC626120Oh8<? super AbstractC1702506lb> interfaceC626120Oh8 = this.LLILLL;
            if (list == null) {
                list = C13BV.INSTANCE;
            }
            interfaceC626120Oh8.onNext(new AbstractC1702506lb(str, i, list) { // from class: X.06lm
                public final String LIZ;
                public final int LIZIZ;
                public final List<Long> LIZJ;

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C1703606lm)) {
                        return false;
                    }
                    C1703606lm c1703606lm = (C1703606lm) obj;
                    return Intrinsics.LJFF(this.LIZ, c1703606lm.LIZ) && this.LIZIZ == c1703606lm.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1703606lm.LIZJ);
                }

                public final int hashCode() {
                    return (((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + this.LIZJ.hashCode();
                }

                public final String toString() {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("OnSilentMemberEvent(conversationId=");
                    sbLIZ.append(this.LIZ);
                    sbLIZ.append(", status=");
                    sbLIZ.append(this.LIZIZ);
                    sbLIZ.append(", silentMembers=");
                    sbLIZ.append(this.LIZJ);
                    sbLIZ.append(')');
                    return C2188811AlT.LIZIZ(sbLIZ);
                }

                {
                    this.LIZ = str;
                    this.LIZIZ = i;
                    this.LIZJ = list;
                }
            });
            return;
        }
        "onSilentMember(): conversationId is null".toString();
        throw new IllegalStateException("onSilentMember(): conversationId is null");
    }
}
