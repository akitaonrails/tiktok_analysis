package X;

import X.AbstractC19924612xY;
import X.AbstractC19924712xZ;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;

/* JADX INFO: renamed from: X.12xY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC19924612xY<MessageType extends AbstractC19924712xZ<MessageType, BuilderType>, BuilderType extends AbstractC19924612xY<MessageType, BuilderType>> extends AbstractC19924512xX<MessageType, BuilderType> {
    public final MessageType defaultInstance;
    public MessageType instance;

    private MessageType newMutableInstance() {
        return (MessageType) this.defaultInstance.newMutableInstance();
    }

    @Override // X.InterfaceC19928112y7
    public MessageType buildPartial() {
        if (!this.instance.isMutable()) {
            return this.instance;
        }
        this.instance.makeImmutable();
        return this.instance;
    }

    public final BuilderType clear() {
        if (this.defaultInstance.isMutable()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.instance = (MessageType) newMutableInstance();
        return this;
    }

    @Override // X.AbstractC19924512xX
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public BuilderType mo79clone() {
        BuilderType buildertype = (BuilderType) this.defaultInstance.newBuilderForType();
        buildertype.instance = (MessageType) buildPartial();
        return buildertype;
    }

    public final void copyOnWrite() {
        if (this.instance.isMutable()) {
            return;
        }
        copyOnWriteInternal();
    }

    @Override // X.InterfaceC19916512wF
    public final boolean isInitialized() {
        return AbstractC19924712xZ.isInitialized(this.instance, false);
    }

    @Override // X.InterfaceC19928112y7
    public final MessageType build() {
        MessageType messagetype = (MessageType) buildPartial();
        if (messagetype.isInitialized()) {
            return messagetype;
        }
        throw AbstractC19924512xX.newUninitializedMessageException(messagetype);
    }

    public void copyOnWriteInternal() {
        MessageType messagetype = (MessageType) newMutableInstance();
        mergeFromInstance(messagetype, this.instance);
        this.instance = messagetype;
    }

    @Override // X.InterfaceC19916512wF
    public MessageType getDefaultInstanceForType() {
        return this.defaultInstance;
    }

    /* JADX INFO: renamed from: clear, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ InterfaceC19928112y7 m88clear() {
        clear();
        return this;
    }

    @Override // X.InterfaceC19916512wF
    public /* bridge */ /* synthetic */ InterfaceC19925612xi getDefaultInstanceForType() {
        return this.defaultInstance;
    }

    public AbstractC19924612xY(MessageType messagetype) {
        this.defaultInstance = messagetype;
        if (!messagetype.isMutable()) {
            this.instance = (MessageType) newMutableInstance();
            return;
        }
        throw new IllegalArgumentException("Default instance must be immutable.");
    }

    @Override // X.AbstractC19924512xX
    public /* bridge */ /* synthetic */ AbstractC19924512xX internalMergeFrom(AbstractC19924812xa abstractC19924812xa) {
        internalMergeFrom((AbstractC19924712xZ) abstractC19924812xa);
        return this;
    }

    public BuilderType mergeFrom(MessageType messagetype) {
        if (this.defaultInstance.equals(messagetype)) {
            return this;
        }
        copyOnWrite();
        mergeFromInstance(this.instance, messagetype);
        return this;
    }

    public BuilderType internalMergeFrom(MessageType messagetype) {
        mergeFrom((AbstractC19924712xZ) messagetype);
        return this;
    }

    public static <MessageType> void mergeFromInstance(MessageType messagetype, MessageType messagetype2) {
        C19921412x2 c19921412x2 = C19921412x2.LIZJ;
        c19921412x2.getClass();
        c19921412x2.LIZ(messagetype.getClass()).LIZ(messagetype, messagetype2);
    }

    @Override // X.AbstractC19924512xX, X.InterfaceC19928112y7
    public BuilderType mergeFrom(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) throws Throwable {
        copyOnWrite();
        try {
            InterfaceC19924912xb interfaceC19924912xbLIZIZ = C19921412x2.LIZJ.LIZIZ(this.instance);
            MessageType messagetype = this.instance;
            C19927412y0 c19927412y0 = abstractC19927312xz.LJ;
            if (c19927412y0 == null) {
                c19927412y0 = new C19927412y0(abstractC19927312xz);
            }
            interfaceC19924912xbLIZIZ.LJIIIIZZ(messagetype, c19927412y0, c19926312xp);
            return this;
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            if (e.getCause() instanceof IOException) {
                throw e.getCause();
            }
            throw e;
        }
    }

    @Override // X.AbstractC19924512xX, X.InterfaceC19928112y7
    public /* bridge */ /* synthetic */ AbstractC19924512xX mergeFrom(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) throws Throwable {
        mergeFrom(abstractC19927312xz, c19926312xp);
        return this;
    }

    @Override // X.AbstractC19924512xX, X.InterfaceC19928112y7
    public /* bridge */ /* synthetic */ InterfaceC19928112y7 mergeFrom(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) throws Throwable {
        mergeFrom(abstractC19927312xz, c19926312xp);
        return this;
    }

    @Override // X.AbstractC19924512xX
    public BuilderType mergeFrom(byte[] bArr, int i, int i2) throws C19926612xs {
        mergeFrom(bArr, i, i2, C19926312xp.LIZ());
        return this;
    }

    @Override // X.AbstractC19924512xX
    public /* bridge */ /* synthetic */ AbstractC19924512xX mergeFrom(byte[] bArr, int i, int i2) throws C19926612xs {
        mergeFrom(bArr, i, i2);
        return this;
    }

    @Override // X.AbstractC19924512xX
    /* JADX INFO: renamed from: mergeFrom */
    public /* bridge */ /* synthetic */ InterfaceC19928112y7 mo85mergeFrom(byte[] bArr, int i, int i2) throws C19926612xs {
        mergeFrom(bArr, i, i2);
        return this;
    }

    @Override // X.AbstractC19924512xX
    public BuilderType mergeFrom(byte[] bArr, int i, int i2, C19926312xp c19926312xp) throws C19926612xs {
        copyOnWrite();
        try {
            C19921412x2.LIZJ.LIZIZ(this.instance).LJFF(this.instance, bArr, i, i + i2, new C19926712xt(c19926312xp));
            return this;
        } catch (C19926612xs e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (IOException e2) {
            TryCatchGuardChecker.doCheck(e2);
            throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
        } catch (IndexOutOfBoundsException e3) {
            TryCatchGuardChecker.doCheck(e3);
            throw C19926612xs.LJII();
        }
    }

    @Override // X.AbstractC19924512xX
    public /* bridge */ /* synthetic */ AbstractC19924512xX mergeFrom(byte[] bArr, int i, int i2, C19926312xp c19926312xp) throws C19926612xs {
        mergeFrom(bArr, i, i2, c19926312xp);
        return this;
    }

    @Override // X.AbstractC19924512xX
    /* JADX INFO: renamed from: mergeFrom */
    public /* bridge */ /* synthetic */ InterfaceC19928112y7 mo86mergeFrom(byte[] bArr, int i, int i2, C19926312xp c19926312xp) throws C19926612xs {
        mergeFrom(bArr, i, i2, c19926312xp);
        return this;
    }
}
