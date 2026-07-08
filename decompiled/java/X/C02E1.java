package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02E1, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02E1 extends Message<C02E1, C569402Jw> {
    public static final ProtoAdapter<C02E1> ADAPTER = new ProtoAdapter<C02E1>() { // from class: X.026n
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02E1 decode(ProtoReader protoReader) {
            C02E1 c02e1 = new C02E1();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                } else {
                                    c02e1.show_dubbed_video = ProtoAdapter.BOOL.decode(protoReader);
                                }
                            } else {
                                c02e1.language_code = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c02e1.lang = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c02e1.video = AnonymousClass0213.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02e1;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02E1 c02e1) {
            C02E1 c02e12 = c02e1;
            int iEncodedSizeWithTag = AnonymousClass0213.ADAPTER.encodedSizeWithTag(1, c02e12.video);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c02e12.lang) + protoAdapter.encodedSizeWithTag(3, c02e12.language_code) + ProtoAdapter.BOOL.encodedSizeWithTag(4, c02e12.show_dubbed_video) + c02e12.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02E1 c02e1) {
            C02E1 c02e12 = c02e1;
            AnonymousClass0213.ADAPTER.encodeWithTag(protoWriter, 1, c02e12.video);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 2, c02e12.lang);
            protoAdapter.encodeWithTag(protoWriter, 3, c02e12.language_code);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, c02e12.show_dubbed_video);
            protoWriter.writeBytes(c02e12.unknownFields());
        }
    };
    public String lang;
    public String language_code;
    public Boolean show_dubbed_video;
    public AnonymousClass0213 video;

    public C02E1() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C569402Jw newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
