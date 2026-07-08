package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02a8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C612202a8 extends Message<C612202a8, C612402aA> {
    public static final ProtoAdapter<C612202a8> ADAPTER = new ProtoAdapter<C612202a8>() { // from class: X.02a9
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C612202a8 decode(ProtoReader protoReader) {
            C612402aA c612402aA = new C612402aA();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c612402aA.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                c612402aA.LJFF = C649902gD.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c612402aA.LJ = C591202Sg.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c612402aA.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c612402aA.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C612202a8 c612202a8) {
            C612202a8 c612202a82 = c612202a8;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c612202a82.schema) + C591202Sg.ADAPTER.encodedSizeWithTag(2, c612202a82.fetch_info) + C649902gD.ADAPTER.encodedSizeWithTag(3, c612202a82.location_info) + c612202a82.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C612202a8 c612202a8) {
        }
    };
    public C591202Sg fetch_info;
    public C649902gD location_info;
    public String schema;

    public C612202a8() {
    }

    @Override // com.squareup.wire.Message
    public C612402aA newBuilder() {
        return null;
    }

    public C612202a8(String str, C591202Sg c591202Sg, C649902gD c649902gD) {
        this(str, c591202Sg, c649902gD, ByteString.EMPTY);
    }

    public C612202a8(String str, C591202Sg c591202Sg, C649902gD c649902gD, ByteString byteString) {
        super(ADAPTER, byteString);
        this.schema = str;
        this.fetch_info = c591202Sg;
        this.location_info = c649902gD;
    }
}
