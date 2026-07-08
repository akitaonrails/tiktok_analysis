package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.0pbO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1517880pbO extends Message<C1517880pbO, C1517890pbP> {
    public static final ProtoAdapter<C1517880pbO> ADAPTER = new ProtoAdapter<C1517880pbO>() { // from class: X.0pbN
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1517880pbO decode(ProtoReader protoReader) {
            C1517880pbO c1517880pbO = new C1517880pbO();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c1517880pbO.past_ninety_days_login = C1517850pbL.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c1517880pbO.last_login = C1517850pbL.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1517880pbO;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1517880pbO c1517880pbO) {
            C1517880pbO c1517880pbO2 = c1517880pbO;
            ProtoAdapter<C1517850pbL> protoAdapter = C1517850pbL.ADAPTER;
            return protoAdapter.encodedSizeWithTag(1, c1517880pbO2.last_login) + protoAdapter.encodedSizeWithTag(2, c1517880pbO2.past_ninety_days_login) + c1517880pbO2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1517880pbO c1517880pbO) {
            C1517880pbO c1517880pbO2 = c1517880pbO;
            ProtoAdapter<C1517850pbL> protoAdapter = C1517850pbL.ADAPTER;
            protoAdapter.encodeWithTag(protoWriter, 1, c1517880pbO2.last_login);
            protoAdapter.encodeWithTag(protoWriter, 2, c1517880pbO2.past_ninety_days_login);
            protoWriter.writeBytes(c1517880pbO2.unknownFields());
        }
    };
    public C1517850pbL last_login;
    public C1517850pbL past_ninety_days_login;

    @Override // com.squareup.wire.Message
    public C1517890pbP newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }

    public C1517880pbO(C1517850pbL c1517850pbL, C1517850pbL c1517850pbL2) {
        this(c1517850pbL, c1517850pbL2, ByteString.EMPTY);
    }

    public C1517880pbO(C1517850pbL c1517850pbL, C1517850pbL c1517850pbL2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.last_login = c1517850pbL;
        this.past_ninety_days_login = c1517850pbL2;
    }
}
